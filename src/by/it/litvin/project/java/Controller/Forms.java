package by.it.litvin.project.java.Controller;


import java.text.ParseException;

public class Forms {

    public static String getString(String parameter,String pattern) throws ParseException {
        if ((parameter!=null) && parameter.matches(pattern)){
            return parameter;
        }
        else {
            throw new ParseException("Incorrect String:"+parameter,-1);
        }
    }
}
