package v18.time;

import java.time.LocalDate;

public class LocalTimeAPI {

    public static void getLocalTime(){
        LocalDate date = LocalDate.now();
        System.out.println("The current date is "+date);
    }

}
