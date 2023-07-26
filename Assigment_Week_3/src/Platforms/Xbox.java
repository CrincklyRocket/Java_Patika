package Platforms;
import Controllers.*;

public class Xbox {
    boolean isDeviceOpen = false;

    public void open() {
        if (isDeviceOpen) {
            throw new RuntimeException("Konsol zaten çalışıyor.");
        }
        System.out.println("Konsol açılıyor");
        isDeviceOpen = true;
    }

    public void shutdown() {
        if (!isDeviceOpen) {
            throw new RuntimeException("Konsol zaten kapalı.");
        }
        System.out.println("Konsol kapanıyor.");
        isDeviceOpen = false;
    }

    public void addController(GameController controller) {
        if (!isDeviceOpen) {
            throw new RuntimeException("Konsol kapalıyken kontrolcü ekleyemezsin");
        }
        System.out.println("Kontrolcü eklendi.");
    }

    public void playGame() {
        if (!isDeviceOpen) {
            throw new RuntimeException("Oynayabilmek için konsolun açık olması gerekir");
        }
        System.out.println("Oyun başlatıldı");
    }
}
