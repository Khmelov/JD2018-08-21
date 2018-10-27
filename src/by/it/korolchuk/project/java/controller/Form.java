package by.it.korolchuk.project.java.controller;

import javax.servlet.http.HttpServletRequest;

public class Form {

    static  boolean isPost(HttpServletRequest req) {
        return req.getMethod().equalsIgnoreCase("post");
    }

    static  boolean isGet(HttpServletRequest req) {
        return  req.getMethod().equalsIgnoreCase("get");
    }

    static String getString(HttpServletRequest request, String name) {
        return getString(request, name, ".*");
    }

    static String getString(HttpServletRequest request, String name, String pattern) {
        String value = request.getParameter(name);
        if (value != null && value.matches("[0-9]+")) {
            return String.valueOf(value);
        }
        return null;
    }

    static Integer getInt(HttpServletRequest request, String name, String pattern) {
        String value = request.getParameter(name);
        if (value != null && value.matches("[0-9]+")) {
            return Integer.valueOf(value);
        }
        return null;
    }
}
