package by.it.litvin.project.java.Controller;

import by.it.litvin.project.java.dao.Dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CmdIndex extends Cmd {
    @Override
    public Cmd execute(HttpServletRequest req, HttpServletResponse resp) {
//        req.setAttribute("forms", Dao.getDao().form.getAll());
        return null;
    }
}
