INSERT INTO Country (name)
VALUES ('Türkiye'),
       ('Germany'),
       ('England'),
	   ('Spain'),
	   ('Italy');

INSERT INTO League(name, id_Country)
VALUES ('Süper Lig', 1),
       ('Premier League', 3),
       ('Serie A', 5), 
	   ('La Liga', 4),
	   ('Bundesliga',2);
	   
INSERT INTO Team (name, id_league, year_of_foundation, scored_goal, conceded_goal, league_point, league_standings)
VALUES ('Galatasaray', 1, 1905, 35, 18, 70, 1),
       ('Fenerbahçe', 1, 1907, 27, 15, 68, 2),
       ('Chelsea', 2, 1905, 24, 9, 72, 1),
	   ('Liverpool', 2, 1892, 18, 21, 60, 3),
	   ('Barcelona ', 4, 1899, 36, 18, 72, 1),
	   ('Sevilla ', 4, 1890, 10, 15, 50, 5),
	   ('Juventus ', 3, 1897, 8, 12, 50, 4),
	   ('Napoli ', 3, 1926, 60, 18, 72, 1),
	   ('Borussia Dortmund', 5, 1909, 30, 15, 72, 1),
	   ('Bayern Munich', 5, 1900, 15, 20, 40, 8);
INSERT INTO Team (name, year_of_foundation, scored_goal, conceded_goal)	   
VALUES ( 'Paris Saint-Germain', 1970, 18, 5);
	   
	   

INSERT INTO Player (first_name, last_name, id_Team, id_Country, player_scored_goal)
VALUES ('Arda', 'Turan', 1, 1, 10),
       ('Emre', 'Belözoğlu', 2, 1, 8),
       ('Mesut', 'Özil', 3, 1, 12),
	   ('Eddi', 'Vasilevich', 9, 4, 6),
	   ('Hartley', 'Rennebach', 2, 4, 5),
	   ('Luciano', 'Matyashev', 8, 5, 3),
	   ('Cornelle', 'Lippett', 6, 2, 11),
	   ('Hilarius', 'Figgess', 5, 3, 11),
	   ('Chloette', 'Gauthorpp', 4, 3, 1),
	   ('Tore', 'Martell', 1, 2, 1),
	   ('Dona', 'Guyot', 3, 1, 5),
	   ('Derron', 'Thay', 10, 3, 9),
	   ('Natty', 'Swepson', 8, 4, 1),
	   ('Zacharie', 'Armes', 3, 5, 8),
	   ('Gerhard', 'Janaszewski', 9, 2, 10),
	   ('Alie', 'Tonbridge', 2, 4, 4),
	   ('Camala', 'Greguoli', 2, 3, 10),
	   ('Ogdan', 'Quarmby', 1, 5, 8),
	   ('Rhodia', 'Yakhin', 4, 3, 7),
	   ('Gert', 'Collinson', 2, 4, 12);

	   
