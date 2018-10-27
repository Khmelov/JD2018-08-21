package by.it.litvin.project.java.Controller;


import by.it.litvin.project.java.dao.Dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public class CmdProfile extends Cmd {
    @Override
    public Cmd execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        if (Forms.isPost(req)&&req.getParameter("logout")!=null){
            HttpSession session=req.getSession();
            session.invalidate();
            return Action.LOGIN.cmd;
        }

//        List<Forms> forms= Dao.getDao().form.getAll()
        return null;
    }
}

//    public static void main(String[] args) throws SQLException {
//        String where = String.format(" WHERE Login='%s' AND PASSWORD='%s'", "testLogin", "testPassword");
//        List<User> all = Dao.getDao().user.getAll(where);
//        System.out.println(all.get(0));
//    }


