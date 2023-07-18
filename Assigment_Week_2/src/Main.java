import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        SmartPhone Apple = new SmartPhone();
        SmartPhone Huawei = new SmartPhone();
        SmartPhone Samsung = new SmartPhone();
        SmartPhone GM = new SmartPhone();
        SmartPhone Xiaomi = new SmartPhone();


        PhoneApp app = new PhoneApp(Apple, Huawei, Samsung, GM, Xiaomi);

        System.out.println("Telefonların Toplam Değeri: " + app.calculateTotalPrice(app.smartPhoneArray) + " TL");

    }
}