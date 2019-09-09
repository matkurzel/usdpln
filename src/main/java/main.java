import java.util.Scanner;


public class main {



        public static void main(String[] args) {
        try {

            Boolean check = false;
            String date = "";

            //check date format, renew request if wrong
            while(!check || dates.diff(date, dates.today())<0) {
                System.out.println("Podaj date w formacie rrrr-mm-dd");
                Scanner scan = new Scanner(System.in);
                date = scan.nextLine();
                check = dates.isDateValid(date);
                if(!check)
                {
                    System.out.println("Błędny format daty, ");
                }
            }

            System.out.println("Kurs z dnia| kupno |roznica|sprzedaz|roznica");
            httpr.httpRequest(date, dates.today());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}