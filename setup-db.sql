use mybook;

-- Create tables
CREATE TABLE book(  
    book_id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    isbn VARCHAR(13) not null COMMENT 'International Standard Book Number',
    title VARCHAR(150) not null COMMENT 'Book Title',
    price DECIMAL(5,2) COMMENT 'Price'
) DEFAULT CHARSET UTF8 COMMENT 'book table create table';

CREATE TABLE book_author(  
    book_id int NOT NULL PRIMARY KEY COMMENT 'Book ID',
    author_id int NOT NULL PRIMARY KEY COMMENT 'Author ID',
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (author_id) REFERENCES author(author_id)
) DEFAULT CHARSET UTF8 COMMENT 'book_author create table';

CREATE TABLE author(  
    author_id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Author ID',
    author_name VARCHAR(50) COMMENT 'Author name'
) DEFAULT CHARSET UTF8 COMMENT 'author create table';

-- Insert data
INSERT INTO book (isbn, title, price) VALUES ('9781847941831', 'Atomic Habits : the life-changing million-copy #1 bestseller', 26.09);
SET @last_id_in_book = LAST_INSERT_ID();
INSERT INTO author (author_name) VALUES ('James Clear');
INSERT INTO book_author (book_id, author_id) VALUES (@last_id_in_book, LAST_INSERT_ID());

INSERT INTO book (isbn, title, price) VALUES ('9781648279201', 'Grandmaster of Demonic Cultivation: Mo Dao Zu Shi (Novel) Vol. 2', 30.4);
SET @last_id_in_book = LAST_INSERT_ID();
INSERT INTO author (author_name) VALUES ('Mo Xiang Tong Xiu');
INSERT INTO book_author (book_id, author_id) VALUES (@last_id_in_book, LAST_INSERT_ID());

INSERT INTO book (isbn, title, price) VALUES ('9780141988511', '12 Rules for Life : An Antidote to Chaos', 18.42);
SET @last_id_in_book = LAST_INSERT_ID();
INSERT INTO author (author_name) VALUES ('Jordan B. Peterson');
INSERT INTO book_author (book_id, author_id) VALUES (@last_id_in_book, LAST_INSERT_ID());

INSERT INTO book (isbn, title, price) VALUES ('9781786691378', 'Pachinko : The New York Times Bestseller', 17.65);
SET @last_id_in_book = LAST_INSERT_ID();
INSERT INTO author (author_name) VALUES ('Min Jin Lee');
INSERT INTO book_author (book_id, author_id) VALUES (@last_id_in_book, LAST_INSERT_ID());

INSERT INTO book (isbn, title, price) VALUES ('9780241539590', 'Manifest : The Sunday Times bestseller that will change your life', 25.2);
SET @last_id_in_book = LAST_INSERT_ID();
INSERT INTO author (author_name) VALUES ('Roxie Nafousi');
INSERT INTO book_author (book_id, author_id) VALUES (@last_id_in_book, LAST_INSERT_ID());

INSERT INTO book (isbn, title, price) VALUES ('9780751565355', "Harry Potter and the Philosopher's Stone : Illustrated Edition", 48.54);
SET @last_id_in_book = LAST_INSERT_ID();
INSERT INTO author (author_name) VALUES ('J. K. Rowling');
INSERT INTO book_author (book_id, author_id) VALUES (@last_id_in_book, LAST_INSERT_ID());