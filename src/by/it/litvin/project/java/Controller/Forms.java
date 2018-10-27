package by.it.litvin.project.java.Controller;


import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

public class Forms {

    static boolean isPost(HttpServletRequest req){
        return req.getMethod().equalsIgnoreCase("post");
    }

    static boolean isGet(HttpServletRequest req){
        return req.getMethod().equalsIgnoreCase("get");
    }

    public static String getString(String parameter,String pattern) throws ParseException {
        if ((parameter!=null) && parameter.matches(pattern)){
            return parameter;
        }
        else {
            throw new ParseException("Incorrect String:"+parameter,-1);
        }
    }



}
