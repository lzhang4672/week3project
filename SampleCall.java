import java.net.*;
import java.io.*;

public class SampleCall {
    public static void main(String[] args) throws Exception {
        URL apple = new URL("https://api.marketdata.app/v1/stocks/quotes/AAPL/");
        URLConnection connect = apple.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        connect.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}