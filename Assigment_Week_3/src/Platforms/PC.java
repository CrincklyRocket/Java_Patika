package Platforms;

import Controllers.GameController;

public class PC {
    boolean isDeviceOpen = false;
    boolean isCabled = false;

    public void open() {
        if (isDeviceOpen) {
            throw new RuntimeException("Bilgisayar zaten çalışıyor.");
        }
        System.out.println("Bilgisayar açılıyor");
        isDeviceOpen = true;
    }

    public void shutdown() {
        if (!isDeviceOpen) {
            throw new RuntimeException("Bilgisayar zaten kapalı.");
        }
        System.out.println("Bilgisayar kapanıyor.");
        isDeviceOpen = false;
    }

    public void connectControllerCable(){
        isCabled = true;
    }
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
