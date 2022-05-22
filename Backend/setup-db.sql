use mybook;

-- Create tables
CREATE TABLE book(  
    book_id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    isbn VARCHAR(13) not null COMMENT 'International Standard Book Number',
    title VARCHAR(150) not null COMMENT 'Book Title',
    price DECIMAL(5,2) COMMENT 'Price'
) DEFAULT CHARSET UTF8 COMMENT 'book table create table';

CREATE TABLE author(  
    author_id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Author ID',
    author_name VARCHAR(50) COMMENT 'Author name'
) DEFAULT CHARSET UTF8 COMMENT 'author create table';

CREATE TABLE book_author(  
    book_id int NOT NULL COMMENT 'Book ID',
    author_id int NOT NULL COMMENT 'Author ID',
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (author_id) REFERENCES author(author_id)
) DEFAULT CHARSET UTF8 COMMENT 'book_author create table';

-- composite key for book_author
ALTER TABLE book_author ADD PRIMARY KEY (book_id, author_id);