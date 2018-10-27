package by.it.korolchuk.project.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CmdProfile extends Cmd {
    @Override
    Cmd execute(HttpServletRequest req, HttpServletResponse resp) {
        if (Form.isPost(req) && req.getParameter("logout") != null) {
            HttpSession session = req.getSession();
            session.invalidate();
            return Action.LOGIN.cmd;
        }
        return null;
    }
}
