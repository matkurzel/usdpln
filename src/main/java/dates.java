import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    //date into string
    public static String format(Date d)
    {
        return df.format(d);
    }

}
