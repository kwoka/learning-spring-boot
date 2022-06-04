
--Team Table
CREATE TABLE team(
  team_id INT PRIMARY KEY,
  name VARCHAR(150) NOT NULL,
  location VARCHAR(100) NOT NULL
);

-- Player Table
CREATE TABLE player(
  player_id INT PRIMARY KEY,
  name VARCHAR(150) NOT NULL,
  age INT NOT NULL,
  team_id INT NOT NULL);
