import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        try {

            Boolean check = false;
            String date = "";

            //check date format, renew request if wrong
            while(!check) {
                System.out.println("Podaj date w formacie rrrr-mm-dd (nie wczesniej niz 2002-01-02 i nie pozniej niz dzisiaj)");
                Scanner scan = new Scanner(System.in);
                date = scan.nextLine();
                check = dates.isDateValid(date);
                if(!check)
                {
                    System.out.println("Błędny format daty lub zbyt odlegla");
                }
            }

            System.out.println("Kurs z dnia| kupno |roznica|sprzedaz|roznica");
            httpr.httpRequest(date, dates.today());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}