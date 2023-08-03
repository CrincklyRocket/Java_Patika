# Telefon Uygulaması

Projede kullanılan sınıflar aşağıdaki gibidir

-   `Product` Sınıfı: Bu sınıf telefon ürünlerinin temel özelliklerini içeren bir üst sınıftır. İçerisinde "storage, ram, camera"price, ID, name, brand bilgilerini içerir içerir.
-   `Phone` Sınıfı: Product sınıfından inherit edilmiş alt sınıftır ve Ek olarak "phoneNumber" bilgisini içerir içerir.
-   `SmartPhone` Sınıfı: Phone sınıfından inherit edilmiş alt sınıftır ve Ek olarak "storage, ram, camera" bilgilerini içerir içerir. 
-   `PhoneApp` Sınıfı: .


## Sınıf Tanımları

```java
// Product sınıfı
public class Product {
    int id;
    double price;
    String name;

    public Product(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
}

// Phone sınıfı
public class Phone extends Product {
    String phoneNumber;

    public Phone(int id, double price, String name, String phoneNumber) {
        super(id, price, name);
        this.phoneNumber = phoneNumber;
    }
}

// SmartPhone sınıfı
public class SmartPhone extends Phone {
    int storage;
    int ram;
    int camera;

    public SmartPhone(int id, double price, String name, String phoneNumber, int storage, int ram, int camera) {
        super(id, price, name, phoneNumber);
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }
}
