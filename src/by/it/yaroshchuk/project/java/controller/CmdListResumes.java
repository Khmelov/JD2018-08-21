package by.it.yaroshchuk.project.java.controller;

import by.it.yaroshchuk.project.java.beans.Resume;
import by.it.yaroshchuk.project.java.beans.User;
import by.it.yaroshchuk.project.java.dao.Dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public class CmdListResumes extends Cmd {
    @Override
    public Cmd execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
       if (Util.getUser(req) == null){
           req.setAttribute("resumes", Dao.getDao().resume.getAll());
           return null;
       }

        User user = Util.getUser(req);



        if(user.getRolesId() == 2){
            List<Resume> resumes = Dao.getDao().resume.getAll(" WHERE `resumes`.`users_id`=" + user.getId());
            HttpSession session = req.getSession();
            session.setAttribute("resumes", resumes);
        }
        return null;
    }
}
