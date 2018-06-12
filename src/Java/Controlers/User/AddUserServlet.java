package Controlers.User;
import Bean.ProfileBeanI;
import Bean.UserBeanI;
import Controlers.CustomServlet;
import Entity.Profile;
import java.util.Date;
import Entity.Enums.YesNo;
import Entity.Enums.Status;

import Entity.User;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "addUser")
public class AddUserServlet extends CustomServlet {

    @EJB
    ProfileBeanI profileBeanI;

    @EJB
    UserBeanI userBeanI;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("addUser.jsp");
        requestDispatcher.forward(req,resp);
        //super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("--------------------------got in here well");
        User user=new User();
        Profile profile=new Profile();
        user.setSurname(get(req,"sName"));
        System.out.println("--------------------------sname"+user.getSurname());
        user.setOthernames(get(req,"oName"));
        user.setEmail(get(req,"em"));
        user.setUsername(get(req,"uName"));
        if (user.getUsername().equals(null))
            user.setUsername(user.getEmail());
        String pass=get(req,"pass");
        String confPass=get(req,"confpass");
        if (pass.equals(confPass))
            user.setPassword(pass);


//        else
            //-------------------------------

        //user.setMobileNumber(get(req,""));
        //getprbyid
//        profile.setName(get(req,""));
//        Profile p= (Profile) profileBeanI.viewByName(profile);
//        user.setProfile(p);

//        user.setIsUserSuper(get(req,""));
//        user.setStatus(Status.fromString(get(req,"")));
//        user.setDateStatusChanged(new Date());
//        user.setAdmin(YesNo.fromString(get(req,"")));
//        user.setChangePassword(YesNo.fromString(get(req,"")));
//        user.setAuthentic(false);

//        HttpSession session=req.getSession(false);
//        if (session.getAttribute("name")!=null){
            System.out.println("--------------------------Now going to userbean");
            System.out.println("--------------------------Now going to userbean"+user+user.getEmail());
            if (userBeanI.add(user)){
                System.out.println("--------------------------gone and back "+user);
                System.out.println("--------------------------expected to have persisted");
                resp.sendRedirect("");
            }
//        }



    }
}
