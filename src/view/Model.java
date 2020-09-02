package view;

import java.util.GregorianCalendar;

public class Model {
    String one ="";
    String two;

    GregorianCalendar calendar;
    public Model() {

    }
    public String makeTime( String one, String two){

        one =  "" + new GregorianCalendar().get(calendar.DAY_OF_MONTH);
        System.out.println(one);
        return one;
    }
}
