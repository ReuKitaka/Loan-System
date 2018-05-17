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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AddUserServlet extends CustomServlet {

    @EJB
    ProfileBeanI profileBeanI;

    @EJB
    UserBeanI userBeanI;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user=new User();
        Profile profile=new Profile();
        user.setSurname(get(req,""));
        user.setOthernames(get(req,""));
        user.setUsername(get(req,""));
        user.setPassword(get(req,""));
        user.setEmail(get(req,""));
        user.setMobileNumber(get(req,""));
        //getprbyid
        profile.setName(get(req,""));
        Profile p= (Profile) profileBeanI.viewByName(profile);
        user.setProfile(p);

        user.setIsUserSuper(get(req,""));
        user.setStatus(Status.fromString(get(req,"")));
        user.setDateStatusChanged(new Date());
        user.setAdmin(YesNo.fromString(get(req,"")));
        user.setChangePassword(YesNo.fromString(get(req,"")));
        user.setAuthentic(false);

        HttpSession session=req.getSession(false);
        if (session.getAttribute("name")!=null){
            if (userBeanI.add(user)){
                resp.sendRedirect("");
            }
        }



    }
}
