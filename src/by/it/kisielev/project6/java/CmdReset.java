package by.it.kisielev.project6.java;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class CmdReset extends Cmd {

    @Override
    Cmd execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Dao.getDao().reset();
        return Action.SIGNUP.cmd;
    }

    public static void main(String[] args) throws SQLException {
        String where= String.format(" WHERE Login='%s' AND PASSWORD='%s'","testLogin","testPassword");
        List<Compani> all= Dao.getDao().compani.getAll(where);
        System.out.println(all.get(0));
    }
}
