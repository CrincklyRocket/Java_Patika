package Controllers;

public class Dualsense implements GameController{
    @Override
    public void pressedButtonTop() {
        System.out.println("Üçgen butonuna basıld.");
    }

    @Override
    public void pressedButtonBottom() {
        System.out.println("Çarpı butonuna basıldı.");
    }

    @Override
    public void pressedButtonRight() {
        System.out.println("Daire butonuna basıldı.");
    }

    @Override
    public void pressedButtonLeft() {
        System.out.println("Kare butonuna basıldı.");

    }
}
