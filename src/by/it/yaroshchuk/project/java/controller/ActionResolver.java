package by.it.yaroshchuk.project.java.controller;

import javax.servlet.http.HttpServletRequest;

public class ActionResolver {

    Action resolve(HttpServletRequest req) {
        Action result = Action.ERROR;
        String command = req.getParameter("command");
        try {
            result = Action.valueOf(command.toUpperCase());
        } catch (IllegalArgumentException e) {
            //result = Action.ERROR;
            //message to error.jsp
        }
        return result;
    }
}
