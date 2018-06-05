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


@WebServlet("/addClient")
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
        client.setClientNo(get(req,""));
        client.setClientPhoto(new Photo());
        client.setAddress(new Address());
        client.setFacebook(get(req,""));
        client.setTwitter(get(req,""));
        client.setLinkedIn(get(req,""));
        client.setGoogleplus(get(req,""));
        client.setStatus(Status.fromString(get(req,"")));
        client.setSalary(new BigDecimal(get(req,"")));
        client.setDateCreated(new Date());
        client.setPreparedBy(new User());
        client.setEmployed(YesNo.fromString(get(req,"")));


        Bank bank=new Bank();
        bank.setName(get(req,""));
        Bank b= (Bank) bankBeanI.viewByName(bank);
        client.setBank(b);

        Branch branch=new Branch();
        branch.setName(get(req,""));
        Branch branch1= (Branch) branchBeanI.viewByName(branch);
        client.setBankBranch(branch1);
        client.setBankAccount("");
        client.setUpdated(YesNo.fromString("No"));
        client.setTitle(Title.fromString(""));
        client.setSurname(get(req,""));
        client.setFirstname(get(req,""));
        client.setOthernames(get(req,""));
        client.setGender(Gender.fromString(get(req,"")));
        //client.setDob(get(req,""));
        client.setIdType(IdType.fromString(get(req,"")));
        client.setIdNo(get(req,""));
        client.setMaritalStatus(MaritalStatus.fromString(get(req,"")));

        HttpSession session=req.getSession(false);
        if (session.getAttribute("name")!=null){
            if (clientBeanI.add(client)){
                resp.sendRedirect("");
            }else {
                //session.setAttribute("Please try again",client);
            }

        }
        super.doPost(req, resp);
    }
}
