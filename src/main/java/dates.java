import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class dates {

    private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    //check date format
    public static boolean isDateValid(String date)
    {
        try {
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    //returns todays date as a String
    public static String today()
    {
        return format(new Date());
    }

    //date into String
    public static String format(Date d)
    {
        return df.format(d);
    }

    //difference between dates
    public static long diff(String date1, String date2)
    {
        try {
            Date d1 = df.parse(date1);
            Date d2 = df.parse(date2);
            long diffInMillies = Math.abs(d1.getTime() - d2.getTime());
            return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            return 0;
        }
    }
}
