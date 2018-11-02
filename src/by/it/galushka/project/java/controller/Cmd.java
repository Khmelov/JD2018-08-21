package by.it.galushka.project.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.text.ParseException;

public abstract class Cmd {

    public abstract Cmd execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ParseException;

    @Override
    public String toString() {
        String simpleName = this.getClass().getSimpleName();
        String cmd = simpleName.replace("Cmd", "");

        return cmd;
    }
}
