package iterable;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        LocalDate firstDate = LocalDate.of(2016, Month.MAY, 1);
        LocalDate lastDate = LocalDate.of(2016, Month.MAY, 31);

        for (LocalDate d : new IterableDates(firstDate, lastDate, 10)
                ) {
            Query qInstance  = new Query();
            qInstance.setParameter("startDate", firstDate);
            qInstance.setParameter("endDate", d);
            qInstance.performQuery("New Query");
            firstDate = d;
        }

    }


}


