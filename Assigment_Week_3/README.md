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


Ödev:

![Gamepads](https://github.com/CrincklyRocket/Java_Patika/assets/79373396/dbaaa2b7-1823-41d3-a754-de1e7f60c7c4)


  Yukarıda 2 adet oyun kontrolcüsü var. Birisi XBOX’ın birisi de Playstation’ın. Bu cihazlar diğer
platformlarda çalışamıyor. Yani XBOX sadece XBOX’da, Playstation sadece Playstation’da
çalışabiliyor. Fakat bu iki cihaz da kablo yardımıyla bilgisayara bağlanırsa, çalışabiliyor.
Bilmeyenler için not -> Örneğin Fifa oynayacaksınız. Birisi pas tuşu, birisi şut tuşu, birisi ara pas
tuşu, birisi de orta açma tuşu.
Tuşların ortak yanlarını da düşünerek;
1. GameController adında bir interface oluşturun.
2. Bu interface i XBOX ve Playstation için implemente eden 2 adet class yazın.
3. Xbox, Playstation ve Computer adında 3 sınıf oluşturun.
4. Bu sınıfların open ve shutdown metotları olsun. Eğer açıksa ve open metodu çalıştırılıyorsa
zaten açık gibi bir exception fırlatın. Ya da kapalıysa, cihaz kapalıdır mesajını fırlatın.
4. Bu sınıflarda addController metodu olsun.
5. Bu sınıflarda playGame metodu olsun ve tüm classlar için konsola “oyun başladı” yazsın.
Eğer cihaz kapalıysa zaten kapalıdır exception u fırlatın.
