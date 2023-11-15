import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeExamples {

    //prints out the object
    public static void p (Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        //LocalDates are immutable
        //All time and date APIs on exam don't use constructor, so new LocalDate(); is invalid
        LocalDate now = LocalDate.now();
        p(now);
        LocalDate hireDate = LocalDate.of(2008, Month.APRIL, 21);
        p(hireDate);
        LocalDate aWeekFromNow = now.plusWeeks(1);
        p(aWeekFromNow);
        LocalDate aWeekAgo = now.minusWeeks(1);
        p(aWeekAgo);

        //This doesn't change anything since immutable
        now = now.minusWeeks(1);
        System.out.println();


        //Time
        LocalTime currentTime = LocalTime.now();
        p(currentTime);
        LocalTime timeHired = LocalTime.of(13, 0,0);
        p(timeHired);
        LocalTime hourFromNow = currentTime.plusHours(1);
        LocalTime anHourEarlier = currentTime.minusHours(1);
        System.out.println(hourFromNow + " " + anHourEarlier);
        System.out.println();

        LocalDateTime current = LocalDateTime.now();
        p(current);
        LocalDateTime timeAndDateHired = LocalDateTime.of(2008, Month.APRIL, 21,13,0,0);
        p(timeAndDateHired);
        System.out.println();

        Period period = Period.of(3,5,12);
        current = current.minus(period);
        p(current);
        Period period1 = Period.between(hireDate, now);
        p(period1);
        System.out.println();

        // Date Time Formatter
        LocalDate dtfNow = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        p(dtfNow.format(dtf));

        DateTimeFormatter patternFormatter = DateTimeFormatter.ofPattern("yyyy/dd/M");
//        DateTimeFormatter patternFormatter = DateTimeFormatter.ofPattern("dd 'in the year of' yyyy");
        p(dtfNow.format(patternFormatter));

    }

}
