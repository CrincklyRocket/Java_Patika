package Platforms;

import Controllers.GameController;

public class PC {
    boolean isDeviceOpen = false;
    boolean isCabled = false;

    //Bilgisayar'ın Açan metot.
    public void open() {
        if (isDeviceOpen) {
            throw new RuntimeException("Bilgisayar zaten çalışıyor.");
        }
        System.out.println("Bilgisayar açılıyor");
        isDeviceOpen = true;
    }
    //Bilgisayar'ın Kapatan metot.
    public void shutdown() {
        if (!isDeviceOpen) {
            throw new RuntimeException("Bilgisayar zaten kapalı.");
        }
        System.out.println("Bilgisayar kapanıyor.");
        isDeviceOpen = false;
    }

    //Kontrolcünün bilgisayara bağlanıdığını belirten metot.
    public void connectControllerCable(){
        isCabled = true;
    }
    //Bilgisayara Kontrolcüyü ekleyen metot.
    public void addController(GameController controller) {
        if (!isDeviceOpen) {
            throw new RuntimeException("Bilgisayar kapalıyken kontrolcü ekleyemezsin");
        } else if (!isCabled){
            throw new RuntimeException("Kontrolcü bilgisayara kablo ile bağlı değil ise kontrolcü ekleyemezsin.");
        }
        System.out.println("Bilgisayar eklendi.");
    }
    
    public void playGame() {
        if (!isDeviceOpen) {
            throw new RuntimeException("Oynayabilmek için Bilgisayar açık olması gerekir");
        }
        System.out.println("Oyun başlatıldı");
    }
}
