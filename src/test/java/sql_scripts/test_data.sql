CREATE TABLE IF NOT EXISTS movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    minutes INT NOT NULL,
    genre VARCHAR(50) NOT NULL
);

INSERT INTO movies (name, minutes, genre) values
('Dark Knight', 152, 'ACTION'),
('Memento', 113, 'THRILLER'),
('Theres Something About Mary', 119, 'COMEDY'),
('Super 8', 112, 'THRILLER'),
('Scream', 111, 'HORROR');