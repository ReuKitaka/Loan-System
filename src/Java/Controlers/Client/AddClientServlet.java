package Controlers.Client;
import Bean.BankBeanI;
import Bean.BranchBeanI;
import Bean.ClientBeanI;
import Entity.Bank;
import Entity.Branch;
import Entity.Enums.Title;
import java.util.Date;
import Entity.Enums.MaritalStatus;
import Entity.Address;
import java.math.BigDecimal;
import Entity.Enums.IdType;
import Entity.Enums.Gender;
import Entity.Photo;
import Entity.User;
import Entity.Enums.YesNo;
import Entity.Enums.Status;

import Controlers.CustomServlet;
import Entity.Client;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(urlPatterns = "addClient")
public class AddClientServlet extends CustomServlet {


    @EJB
    ClientBeanI clientBeanI;

    @EJB
    BankBeanI bankBeanI;

    @EJB
    BranchBeanI branchBeanI;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd=req.getRequestDispatcher("addClient.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Client client=new Client();
        client.setClientNo("C1");
//        client.setClientPhoto(new Photo());
        client.setAddress(new Address());
        client.setFacebook(get(req,"fb"));
        client.setTwitter(get(req,"tw"));
        client.setLinkedIn(get(req,"li"));
        client.setGoogleplus(get(req,"gPlus"));
        client.setStatus(Status.fromString(get(req,"")));

        System.out.println("-_-------------------------------------------_____________________"+client.getSalary());
        String salary=get(req,"sal");
        System.out.println("-_-------------------------------------------_____________________"+salary);
        client.setSalary(new BigDecimal(salary));
        System.out.println("-_-------------------------------------------_____________________"+client.getSalary());
        client.setDateCreated(new Date());
//        client.setPreparedBy(new User());
        client.setEmployed(YesNo.fromString(get(req,"")));


//        Bank bank=new Bank();
//        bank.setName(get(req,"bank"));
//        Bank b= (Bank) bankBeanI.viewByName(bank);
//        client.setBank(b);
//
//        Branch branch=new Branch();
//        branch.setName(get(req,"branch"));
//        Branch branch1= (Branch) branchBeanI.viewByName(branch);
//        client.setBankBranch(branch1);
//        client.setBankAccount("accNo");
        client.setUpdated(YesNo.fromString("No"));
        client.setTitle(Title.fromString("tit"));
        client.setSurname(get(req,"sName"));
        client.setFirstname(get(req,"fName"));
        client.setOthernames(get(req,"oNames    "));
        client.setGender(Gender.fromString(get(req,"gen")));
        //client.setDob(get(req,""));
        client.setIdType(IdType.fromString(get(req,"idType")));
        client.setIdNo(get(req,"idNo"));
        client.setMaritalStatus(MaritalStatus.fromString(get(req,"mStatus")));

        HttpSession session=req.getSession(false);
        System.out.println("________________________________________________Ok");
        System.out.println("________________________________________________Ok"+client+client.getOthernames());
//        if (session.getAttribute("name")!=null){
            if (clientBeanI.add(client)){
                System.out.println("________________________________________________From bean"+client+client.getOthernames());
                resp.sendRedirect("");
            }else {
                //session.setAttribute("Please try again",client);
            }

//        }
//        super.doPost(req, resp);
    }
}
