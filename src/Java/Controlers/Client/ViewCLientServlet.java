package Controlers.Client;

import Controlers.CustomServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ViewCLientServlet extends CustomServlet {

    @Override
    public String get(HttpServletRequest req, String key) {
        return super.get(req, key);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
