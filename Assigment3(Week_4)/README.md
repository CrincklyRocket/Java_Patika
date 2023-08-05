# Futbol İstatistik Uygulaması

Bu uygulamada, futbol istatistiklerini yönetmek ve sorgulamak için PostgreSQL kullanarak gerçekleştirilen bir Database uygulamasıdır. İlk dosya içerisinde kullanılacak tabloların "CREATE" Scriptleri, ikinci dosyada test amaçlı oluşturulmuş random dataların, tablolara injection Scriptleri ve son olarak Database'in kullanılabilirliğini değerledirmek adına 7 adet Query'nin yer aldığı sorgu dosyası yer almaktadır.

## Veritabanı Tabloları

Projede kullanılan tablolar ve alanlar aşağıda listelenmiştir:

- **Country (Ülke) Tablosu**
    - id (PRIMARY KEY)
    - name

- **Lig (League) Tablosu**
    - id (PRIMARY KEY)
    - adı
    - id_country (FOREIGN KEY)

- **Takim (Team) Tablosu**
    - id (PRIMARY KEY)
    - adı
    - id_league (FOREIGN KEY)
    - kuruluş yılı
    - attığı gol
    - yediği gol
    - puan
    - seviye

- **Oyuncu (Player) Tablosu**
    - id (PRIMARY KEY)
    - adı
    - soyadı
    - id_team (FOREIGN KEY)
    - id_country (FOREIGN KEY)
    - attığı gol

## Query Örneği

### İsmi "Türkiye" olan ülkenin liglerinin listesi

```sql
SELECT * FROM Lig WHERE id_country = (SELECT id FROM Country WHERE name = 'Türkiye');
```

## Ödev Tanımı:
Futbol İstatistik Uygulaması
Country: id, name
Lig: id, adı, id_country(hangi ülkenin ligi)
Takim: id, adı, id_leauge, kuruluş yılı, attığı gol, yediği gol, puan, seviye(1=en üst lig, 2, onun bir
alt ligi gibi)
Oyuncu: id, adı, soyadı, id_team, id_country(nereli), attığı gol
1. Yukarıdaki tabloların create scriptlerini oluşturunuz.
2. Bu tabloları dolduran insert scriptler yazınız. Ligi olmayan takım
3. İsmi “Türkiye” olan ülkenin liglerinin listesini getiren scripti yazınız.
4. İsmi “Türkiye” olan ülkenin takımların listesini getiren scripti yazınız.
5. İsmi “Türkiye” olan en üst seviyeli ligdeki puan tablosunu getiren scripti yazınız.
6. Türkiye liglerindeki puan ortalamalarını gösteren scrpiti yazınız.
7. Bir ligin Gol kralını getiren scprit yazınız. (oyuncu adı, soyadı, takım adı, nereli olduğu)
8. Tüm liglerde attığı gol yediği golden daha küçük olan takımları getiren scripti yazınız.
9. Bir takımın oyuncularının toplam gol sayısını ve takımın gol sayısını yan yana getiren bir
   scprit yazınız. (kontrol sorgusu gibi, birisi takım verisi, diğeri oyuncuların toplamı olacak
