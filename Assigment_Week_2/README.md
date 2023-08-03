# Proje: Telefon Uygulaması

## Sınıflar

### Product

Product sınıfı, telefon ürünlerinin temel özelliklerini içeren bir üst sınıftır.

#### Özellikler

- id (int): Ürünün benzersiz kimliği.
- price (double): Ürünün fiyatı.
- name (String): Ürünün adı.

### Phone

Phone sınıfı, Product sınıfından miras alan bir alt sınıftır ve telefonların ek özelliklerini içerir.

#### Ek Özellikler

- phoneNumber (String): Telefonun numarası.

### SmartPhone

SmartPhone sınıfı, Phone sınıfından miras alan bir alt sınıftır ve akıllı telefonların ek özelliklerini içerir.

#### Ek Özellikler

- storage (int): Akıllı telefonun depolama kapasitesi.
- ram (int): Akıllı telefonun RAM miktarı.
- camera (int): Akıllı telefonun kamera çözünürlüğü.

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
