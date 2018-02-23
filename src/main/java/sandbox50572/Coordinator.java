package sandbox50572;

import java.util.Date;

public class Coordinator implements Runnable {

    String url;
    //конструктор
    public Coordinator(String url) {

        this.url = url;
    }
    public void run() {

        //Цикл запускающий парсер
        for(int i=0; i<1000; i++) {
            //Вывод в консоль текущего времени
            Date date = new Date();
            System.out.println(date.toString());
            //создание объекта workingJsoup
            Runnable workingJsoup = new WorkingJsoup(url);
            //создание потока
            Thread threadJsoup = new Thread(workingJsoup);
            //стартуем поток threadJsoup
            threadJsoup.start();
            //TODO До следующей итерации цикла поток должен завершиться!!!
            //Пауза между запусками парсера
            try {
                //1 час
                //Thread.sleep(3600000);
                //5 минут
                Thread.sleep(300000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
