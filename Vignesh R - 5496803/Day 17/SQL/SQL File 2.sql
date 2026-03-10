SET SQL_SAFE_UPDATES = 0;

DROP TABLE users;

CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    last_login DATE,
    status VARCHAR(20)
);


-- Insert sample data
INSERT INTO users (username, email, last_login, status) VALUES
('vignesh', 'vignesh@gmail.com', '2023-01-10', 'inactive'),
('rahul', 'rahul@gmail.com', '2025-01-15', 'active'),
('anita', 'anita@gmail.com', '2022-12-01', 'inactive');

-- Delete users inactive for more than 1 year
DELETE FROM users
WHERE last_login < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);
