package sandbox50572;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkingJsoup implements Runnable {

    String url;
    //конструктор
    public WorkingJsoup(String url) {

        this.url = url;
    }
    public void run() {

        org.jsoup.nodes.Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //TODO Вывод html страницы
        System.out.println(doc);
        /*
        String name = doc.title();//извлекаем title страницы
        System.out.println("Name of page HTML: " + name);
        //получение содержимого элемента body
        Element mBody = doc.body();
        Elements links = mBody.getElementsByTag("a");//получение ссылок страницы

        for (Element found : links) {
            //вывод найденных ссылок
            System.out.println(found);
        }
        */
        System.out.println("Метод run потока threadJsoup завершен.");
    }
}
