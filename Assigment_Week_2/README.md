# Telefon Uygulaması

Projede kullanılan sınıflar aşağıdaki gibidir

-   `Product` Sınıfı: Bu sınıf telefon ürünlerinin temel özelliklerini içeren bir üst sınıftır. İçerisinde "storage, ram, camera"price, ID, name, brand" bilgilerini içerir içerir.
-   `Phone` Sınıfı: Product sınıfından inherit edilmiş alt sınıftır ve Ek olarak "phoneNumber" bilgisini içerir içerir.
-   `SmartPhone` Sınıfı: Phone sınıfından inherit edilmiş alt sınıftır ve Ek olarak "storage, ram, camera" bilgilerini içerir içerir. Sınıfta AllArgsConstructor ve default Constructer bulunmaktadır.
-   `PhoneApp` Sınıfı: Sınıfın içersinde AllArgsConstructor kullanılarak 5 adet Akıllı telefon oluşturulmuştur. Ve double veri tipinde telefonların toplam değerini geri döndüren "calculateTotalPrice()" metodu tanımlanmıştır

Ödev Tanımı:

|     Product    |            Phone              |      SmartPhone             |
|----------------|-------------------------------|-----------------------------|
|Product         |Product           `            |Product                      |
|name            |name                           |name                         |
|price           |price                          |price                        |
|                |phoneNumber                    |phoneNumber                  |
|                |                               |storage                      |
|                |                               |ram                          |
|                |                               |camera                       |


