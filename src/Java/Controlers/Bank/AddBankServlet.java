package Controlers.Bank;
import Entity.Regime;
import Entity.Enums.PayPointType;
import Entity.Enums.Status;

import Controlers.CustomServlet;
import Entity.Bank;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddBankServlet extends CustomServlet {

    @Override
    public String get(HttpServletRequest req, String key) {
        return super.get(req, key);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Bank bank=new Bank();
        //bank.setId(0L);
        bank.setName("");
        bank.setCode("");
        bank.setSwiftCode("");
        //bank.setPayPointType(new PayPointType());
        //bank.setStatus(new Status());
        bank.setRegime(new Regime());


        super.doGet(req, resp);
    }
}
