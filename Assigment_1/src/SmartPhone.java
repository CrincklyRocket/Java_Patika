public class SmartPhone extends Phone{
    Phone phone;
    int storage;
    int ram;
    int camera;

    SmartPhone(Phone phone,int storage, int ram, int camera){
        this.phone = phone;
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }

    SmartPhone( int price, int ID, String name,int phoneNumber, int storage, int ram, int camera){
        this.price = price;
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }
    SmartPhone(){

    }
}
