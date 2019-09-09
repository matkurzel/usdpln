import java.util.Date;
import java.util.Scanner;


public class main {



        public static void main(String[] args) {
        try {

            System.out.println("Podaj date w formacie rrrr-mm-dd");
            Boolean check = false;
            String date = "";

            //check date format, renew request if wrong
            while(!check) {
                Scanner scan = new Scanner(System.in);
                date = scan.nextLine();
                check = dates.isDateValid(date);
                if(!check)
                {
                    System.out.println("Błędny format daty");
                    System.out.println("Podaj date w formacie rrrr-mm-dd");
                }
            }

            Date today = new Date();
            //call http request
            httpr.call_me(date, dates.format(today));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}