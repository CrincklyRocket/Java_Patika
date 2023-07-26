package Controllers;

public class XboxSeries implements GameController{

    @Override
    public void pressedButtonTop() {
        System.out.println("Y butonuna basıldı.");
    }//

    @Override
    public void pressedButtonBottom() {
        System.out.println("A butonuna basıldı.");

    }

    @Override
    public void pressedButtonRight() {
        System.out.println("X butonuna basıldı.");

    }

    @Override
    public void pressedButtonLeft() {
        System.out.println("B butonuna basıldı.");

    }
}
