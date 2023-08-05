--Türkiye Ligleri
SELECT League.* FROM League 
JOIN Country ON League.id_country = Country.id
WHERE Country.name = 'Türkiye';

--Türkiye Takımları
SELECT Team.* FROM Team
JOIN League ON Team.id_league = League.id
JOIN Country ON League.id_country = Country.id
WHERE Country.name = 'Türkiye';

--Türkiye En Üst Sıralamalı Takım
SELECT Team.* FROM Team
JOIN League ON Team.id_league = League.id
JOIN Country ON League.id_country = Country.id
WHERE Country.name = 'Türkiye'
ORDER BY league_point DESC
LIMIT 1;

--Türkiye Ligindeki Takımların Puan Ortalaması
SELECT AVG(league_point) AS Puan_Ortalaması FROM Team
WHERE id_league IN (SELECT id FROM League WHERE id_country = (SELECT id FROM Country WHERE name = 'Türkiye'));

--Lig ID'si Girilen Ligin Gol Kralı
SELECT Player.first_name, Player.last_name, Team.name AS Takımı, Country.name, Player.player_scored_goal AS Attığı_gol FROM Player
JOIN Team ON Player.id_team = Team.id
JOIN Country  ON Player.id_country = Country.id
WHERE Team.id_league = 2
ORDER BY Player.player_scored_goal DESC
LIMIT 1;

--Attıkları Golden Daha Fazlasını Yiyen Takımlar
SELECT * FROM Team 
WHERE scored_goal < conceded_goal;

--Team ID'si 1 Olan Takımın Toplam Golleri Ve O Takımın Oyuncularının Toplam Golleri 
SELECT Team.id, Team.name, SUM(Player.player_scored_goal) AS Kayıtlı_Olan_Oyuncuların_Golleri, Team.scored_goal AS Takımın_Golü FROM Team
LEFT JOIN Player ON Team.id = Player.id_team
WHERE Team.id = 2
GROUP BY Team.id, Team.name, Team.scored_goal;





