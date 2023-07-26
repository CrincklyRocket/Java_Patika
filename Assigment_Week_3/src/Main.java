import Controllers.*;
import Platforms.*;

public class Main {
    public static void main(String[] args) {


        //Xbox'ın konsolunu ve kontrolcüsünü oluşturuyoruz.
        Xbox seriesX = new Xbox();
        XboxSeries seriesController = new XboxSeries();

        /*
        seriesX.open();
        seriesX.addController(seriesController);
        seriesX.playGame();
        seriesX.shutdown();
        */

        //Playstation'ın konsolunu ve kontrolcüsünü oluşturuyoruz.
        Playstation Ps5 = new Playstation();
        Dualsense dualsense = new Dualsense();

        /*
        Ps5.open();
        Ps5.addController(dualsense);
        Ps5.playGame();
        Ps5.shutdown();
        */

        //Bilgisayara var olan kontrolcülere kablo ile bağlanabildiği için yeni kontrolcü oluşturmuyoruz.
        PC gamingPC = new PC();


        gamingPC.open();

        //Eğer kontrolcü PC'ye kablo ile bağlı değilse exeption fırlatacaktır.
        gamingPC.connectControllerCable();

        gamingPC.playGame();

        //Dualsense diğeriyle aynı arayüzü kullanmasına rağmen dualsense özel tuşlara basacaktır.
        System.out.println("==========================================");

        //Dualsense eklendi.
        gamingPC.addController(dualsense);

        System.out.println("Kontrolcu : Dualsense");
        dualsense.pressedButtonBottom();
        dualsense.pressedButtonLeft();
        dualsense.pressedButtonRight();
        dualsense.pressedButtonTop();

        //Series kontrolcüsü diğeriyle aynı arayüzü kullanmasına rağmen Series kontrolcüsüne özel tuşlara basacaktır.
        System.out.println("==========================================");

        //series kontrolcüsü eklendi.
        gamingPC.addController(seriesController);

        System.out.println("Kontrolcü : Series");
        seriesController.pressedButtonBottom();
        seriesController.pressedButtonLeft();
        seriesController.pressedButtonRight();
        seriesController.pressedButtonTop();

        System.out.println("==========================================");
        gamingPC.shutdown();






    }
}