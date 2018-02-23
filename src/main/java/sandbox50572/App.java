package sandbox50572;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Jsoup Parser
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String url = null;

        System.out.println("write the url");//введите url где искать
        try {
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            url = br2.readLine();
        }catch (IOException e) {
            e.printStackTrace();
        }
        //создание объекта coordinator
        Runnable coordinator = new Coordinator(url);
        //создание потока
        Thread threadCoordinator = new Thread(coordinator);
        //стартуем поток coordinator
        threadCoordinator.start();

    }

 }
