package by.it.voinilo.project.java.controller;



import by.it.voinilo.project.java.beans.Roleparam;
import by.it.voinilo.project.java.entitydao.Dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class CmdReset extends Cmd {

    @Override
    public Cmd execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
            Dao.getDao().reset();
            return Action.GOTOADMINPAGE.cmd;
    }

    public static void main(String[] args) throws SQLException {
        String where = String.format(" WHERE Login='%s' AND PASSWORD='%s'","testLogin","testPassword");
        List<Roleparam> all = Dao.getDao().user.getALL(where);
        System.out.println(all.get(0));
    }
}
