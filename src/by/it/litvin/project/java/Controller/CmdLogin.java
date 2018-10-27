package by.it.litvin.project.java.Controller;

import by.it.litvin.project.java.dao.Dao;
import by.it.litvin.project.java.dao.beans.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class CmdLogin extends Cmd {
    @Override
    public Cmd execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ParseException {
//        req.setAttribute("user", "player");
        if (req.getMethod().equalsIgnoreCase("post")) {
            req.setAttribute("user", "player");
            String login = Forms.getString(req.getParameter("login"), Pattern.LOGIN);
            String password = Forms.getString(req.getParameter("password"),Pattern.PASSWORD);
            Dao dao = Dao.getDao();
            String where = String.format(" WHERE Login='%s' AND PASSWORD='%s'", login, password);
            List<User> users = dao.user.getAll(where);
            if (users.size() > 0) {
                HttpSession session = req.getSession();
                session.setAttribute("user", users.get(0));
                return Action.PROFILE.cmd;
            }
        }
        return null;
    }

//    public static void main(String[] args) throws SQLException {
//        String where = String.format(" WHERE Login='%s' AND PASSWORD='%s'", "testLogin", "testPassword");
//        List<User> all = Dao.getDao().user.getAll(where);
//        System.out.println(all.get(0));
//    }
}
