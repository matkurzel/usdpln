import java.util.Scanner;


public class main {



        public static void main(String[] args) {
        try {

            Boolean check = false;
            String date = "";

            //check date format, renew request if wron  g
            while(!check) {
                System.out.println("Podaj date w formacie rrrr-mm-dd (maks )");
                Scanner scan = new Scanner(System.in);
                date = scan.nextLine();
                check = dates.isDateValid(date);
                if(!check)
                {
                    System.out.println("Błędny format daty, ");
                }
            }

            System.out.println("Kurs z dnia| kupno |roznica|sprzedaz|roznica");
            httpr.call_me(date, dates.today());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}