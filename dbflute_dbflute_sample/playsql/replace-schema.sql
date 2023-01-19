	 create table category(
     id INT AUTO_INCREMENT PRIMARY KEY,
     category_name VARCHAR(15) NOT NULL,
     category_number INT NOT NULL);
     -- category_number 支出：１　収入：２
     
     create table expenses(
     id INT AUTO_INCREMENT PRIMARY KEY,
     date DATE NOT NULL,
     category_id INT NOT NULL,
     income INT,
     expenditure INT,
     detail VARCHAR(20),
     FOREIGN KEY(category_id)
     REFERENCES category(id));