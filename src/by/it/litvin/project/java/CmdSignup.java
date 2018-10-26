package by.it.litvin.project.java;

import by.it.litvin.project.java.Controller.Forms;
import by.it.litvin.project.java.Controller.Pattern;
import by.it.litvin.project.java.dao.Dao;
import by.it.litvin.project.java.dao.beans.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.text.ParseException;

public class CmdSignup extends Cmd {
    @Override
    public Cmd execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ParseException {
        if (req.getMethod().equalsIgnoreCase("post")) {
            String login = Forms.getString(req.getParameter("login"), Pattern.LOGIN);
            String email = Forms.getString(req.getParameter("email"),Pattern.EMAIL);
            String password = Forms.getString(req.getParameter("password"),Pattern.PASSWORD);
            User user=new User(0,login,password,email,2);
            Dao dao=Dao.getDao();
            dao.user.create(user);
            return Action.LOGIN.cmd;
        }
        return null;
    }
}
