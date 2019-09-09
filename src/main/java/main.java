import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class main {

   public static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        public static void main(String[] args) {
        try {

            System.out.println("Podaj date w formacie rrrr-mm-dd");
            Boolean check = false;
            String date = "";

            //check date format, renew request if wrong
            while(check == false) {
                Scanner scan = new Scanner(System.in);
                date = scan.nextLine();
                check = isDateValid(date);
                if(check == false)
                {
                    System.out.println("Błędny format daty");
                    System.out.println("Podaj date w formacie rrrr-mm-dd");
                }
            }

            Date today = new Date();
            //call http request
            httpr.call_me(date, df.format(today));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //date format checker
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
}