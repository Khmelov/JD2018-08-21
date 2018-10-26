package by.it.litvin.project.java;

import by.it.litvin.project.java.Controller.Forms;
import by.it.litvin.project.java.Controller.Pattern;
import by.it.litvin.project.java.dao.Dao;
import by.it.litvin.project.java.dao.beans.Form;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.text.ParseException;

public class CmdCreateForm extends Cmd{
    @Override
    public Cmd execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ParseException {
        if (req.getMethod().equalsIgnoreCase("post")) {
            String name = Forms.getString(req.getParameter("name"), Pattern.NAME);
            String surname = Forms.getString(req.getParameter("surname"),Pattern.SURNAME);
            String address = Forms.getString(req.getParameter("address"),Pattern.ADDRESS);
            String description = Forms.getString(req.getParameter("description"),Pattern.DESCRIPTION);
            int age=Integer.parseInt(Forms.getString(req.getParameter("age"),Pattern.AGE));
            String information = Forms.getString(req.getParameter("information"),Pattern.INFORMATION);
            String aim = Forms.getString(req.getParameter("aim"),Pattern.AIM);
            Form form=new Form(0,name,surname,address,description,age,
                    information,aim,2);
            Dao dao=Dao.getDao();
            dao.form.create(form);
        }
        return null;
    }
    }

