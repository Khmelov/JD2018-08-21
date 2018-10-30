package by.it.korolchuk.project.java.controller;

import javax.servlet.http.HttpServletRequest;

class ActionResolver {

    Action resolve(HttpServletRequest req) {
        Action result = Action.ERROR;
        String command = req.getParameter("command");

        if (command == null) return Action.INDEX;
        try {
            Action action = Action.valueOf(command.toUpperCase());
            req.getServletContext().log("RESOLVE:" + action.cmd.toString());
            result = Action.valueOf(command.toUpperCase());
        } catch (IllegalArgumentException e) {
            //result = Action.ERROR;
        }
        return  result;
    }
}
