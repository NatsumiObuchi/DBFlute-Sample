	 create table category(
     id INT AUTO_INCREMENT PRIMARY KEY,
     category_name VARCHAR(15) UNIQUE NOT NULL,
     category_flag TINYINT(1) NOT NULL);
     -- category_flag 支出：１　収入：２
     
     create table expenses(
     id INT AUTO_INCREMENT PRIMARY KEY,
     date DATE NOT NULL,
     category_id INT NOT NULL,
     income INT,
     expenditure INT,
     detail VARCHAR(20),
     FOREIGN KEY(category_id)
     REFERENCES category(id));
     
     INSERT INTO category(category_name, category_flag) 
     VALUES("家賃",1),("光熱費",1),("食費",1),("外食費",1),("日用品",1),
     ("交通費",1),("衣服",1),("交際費",1),("趣味",1),("趣味",1),("その他",1),
     ("給料",2),("その他",2);