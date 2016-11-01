package iterable;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;

public class IterableDates implements Iterable<LocalDate> {

    private LocalDate startDate;
    private LocalDate endDate;
    private int intervalDays;

    public IterableDates(LocalDate startDate, LocalDate endDate, int intervalDays) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.intervalDays = intervalDays;
    }

    @Override
    public Iterator<LocalDate> iterator() {

        return new Iterator<LocalDate>() {
            LocalDate currentDate = startDate;

            public boolean hasNext() {
                return !currentDate.isAfter(endDate) && !currentDate.isEqual(endDate);
            }

            public LocalDate next() {
                currentDate = currentDate.plus(Period.ofDays(intervalDays));
                if (currentDate.isAfter(endDate)) {return endDate;}
                return currentDate;
            }

            public void remove() { // not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

}
