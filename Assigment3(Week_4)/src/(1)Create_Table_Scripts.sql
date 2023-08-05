CREATE TABLE Country (
	id SERIAL PRIMARY KEY,
	name VARCHAR(255)
);
CREATE TABLE League (
	id SERIAL PRIMARY KEY,
	name VARCHAR(255),
	id_Country INTEGER,
	FOREIGN KEY (id_country) REFERENCES Country (id)
);
CREATE TABLE Team (
	id SERIAL PRIMARY KEY,
	name VARCHAR(255),
	id_league INTEGER,
	FOREIGN KEY (id_league) REFERENCES League (id),
	year_of_foundation INTEGER,
	scored_goal INTEGER,
	conceded_goal INTEGER,
	league_point INTEGER,
	league_standings INTEGER
);
CREATE TABLE Player (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(255),
	last_name VARCHAR(255),
	id_Team INTEGER,
	FOREIGN KEY (id_Team) REFERENCES Team (id),
	id_Country INTEGER,
	FOREIGN KEY (id_country) REFERENCES Country (id),
	player_scored_goal INTEGER
);