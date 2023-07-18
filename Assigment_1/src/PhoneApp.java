public class PhoneApp {
    SmartPhone Apple = new SmartPhone(20000, 1800811005, "iPhone", 536925812, 128,8,64);
    SmartPhone Huawei = new SmartPhone(8000, 1084891225, "p60Pro", 536925812, 128,8,64);
    SmartPhone Samsung = new SmartPhone(12000, 110246515, "s23", 536925812, 128,8,64);
    SmartPhone GM = new SmartPhone(8000, 187561225, "GM22Plus", 536925812, 128,8,64);
    SmartPhone Xiaomi = new SmartPhone(13000, 190654654, "redmi9", 536925812, 128,8,64);

    public SmartPhone[] smartPhoneArray = {Apple,Huawei,Samsung, GM, Xiaomi};
    PhoneApp(SmartPhone Apple, SmartPhone Huawei, SmartPhone Samsung, SmartPhone GM, SmartPhone Xiaomi){
        this.Apple = Apple;
        this.Huawei = Huawei;
        this.Samsung = Samsung;
        this.GM = GM;
        this.Xiaomi = Xiaomi;
    }

    public double calculateTotalPrice(SmartPhone[] smartPhoneArray){

        double total = 0.0;
        for (int i = 0; i < smartPhoneArray.length; i++){
            total += smartPhoneArray[i].price;
            System.out.println(total);
        }
    return total;
    }
}

