# Oyun Kontrolcüleri Uygulaması

Bu uygulama, farklı oyun kontrolcüleri arasında geçiş yaparak oyun oynamayı sağlayan bir Java programıdır. Programda Xbox ve Playstation kontrolcüleri bulunmaktadır. Bu kontrolcüler, bilgisayarla kablo yardımıyla bağlanabilmektedir. Aynı zamanda, oyun oynamadan önce cihazları açıp kapatabilir ve kontrolcüleri ekleyebilirsiniz.


## Sınıflar ve Arayüzler

Projede kullanılan sınıflar ve arayüzler aşağıdaki gibidir

-   `GameController` Arayüzü: Bu arayüz, Xbox ve Playstation kontrolcülerinin temel işlevlerini tanımlar.
-   `XboxController` Sınıfı: `GameController` arayüzünü implemente eden Xbox kontrolcüsü sınıfı.
-   `PlaystationController` Sınıfı: `GameController` arayüzünü implemente eden Playstation kontrolcüsü sınıfı.
-   `Xbox` Sınıfı: Xbox cihazını temsil eden sınıf.
-   `Playstation` Sınıfı: Playstation cihazını temsil eden sınıf.
-   `Computer` Sınıfı: Bilgisayarı temsil eden sınıf.
