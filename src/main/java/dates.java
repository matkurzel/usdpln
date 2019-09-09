import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class dates {


    private static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    //check date format
    public static boolean isDateValid(String date) {
        try {
            LocalDate ld = LocalDate.parse(date, df);
            String result = ld.format(df);
            return result.equals(date);
        } catch (Exception e) {
            return false;
        }

    }

    //returns todays date as a String
    public static String today() {
        return format(LocalDate.now());
    }

    //date into String
    private static String format(LocalDate d) {
        return df.format(d);
    }

    //difference between dates
    public static long diff(String date1, String date2) {
        try {
            LocalDate d1 = LocalDate.parse(date1, df);
            LocalDate d2 = LocalDate.parse(date2, df);
            return ChronoUnit.DAYS.between(d1, d2);
        } catch (Exception e) {
            return 0;
        }
    }

    public static String plus(String date, long days){
        LocalDate d = LocalDate.parse(date, df);
        d = d.plusDays(days);
        return format(d);
    }

}
