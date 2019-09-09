import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;

public class httpr {

    public static void httpRequest(String date1, String date2){
        try {
            if (dates.diff(date1, date2) > 93) {
                call_me(date1, dates.plus(date1, 93));
                date1 = dates.plus(date1, 93);
                httpRequest(date1, date2);
            } else {
                call_me(date1, date2);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void call_me(String date1, String date2) throws Exception {

        String url = "http://api.nbp.pl/api/exchangerates/rates/c/usd/"+ date1 +"/"+ date2 +"/";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print rates table
        printTable(response.toString());


    }

    private static void printTable (String response) {
        JSONObject myResponse = new JSONObject(response);
        double difa = 0;
        double difb = 0;
        DecimalFormat df = new DecimalFormat("#0.0000");
        for (Object o : myResponse.getJSONArray("rates")) {
            if (o instanceof JSONObject) {
                double ask = ((JSONObject) o).getDouble("ask");
                double bid = ((JSONObject) o).getDouble("bid");
                String s = "";
                StringBuilder sB = new StringBuilder(s);
                sB.append(((JSONObject) o).getString("effectiveDate"));
                sB.append(" |");
                sB.append(df.format(ask));
                sB.append(" |");
                if (ask - difa > 0)
                    sB.append("+");
                sB.append(df.format(ask - difa));
                sB.append("|");
                sB.append(df.format(bid));
                sB.append("  |");
                if (bid - difb > 0)
                    sB.append("+");
                sB.append(df.format(bid - difb));
                difa = ask;
                difb = bid;
                s = sB.toString();
                System.out.println(s);


            }
        }
    }
}
