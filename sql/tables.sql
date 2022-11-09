drop table if exists librarians;
create table librarians (
    `id` integer auto_increment primary key,
    `first_name` varchar(55),
    `last_name` varchar(55),
    `username` varchar(55),
    `password` varchar(55),
    `pin` integer
);

/*
--Test values:
insert into librarians values (null, 'Joe', 'Smith', 'jsmith', 'password123', 123456);
*/

drop table if exists members;
create table members (
    `id` integer auto_increment primary key,
    `first_name` varchar(55),
    `last_name` varchar(55),
    `username` varchar(55),
    `password` varchar(55)
);

/*
--Test values:
insert into members values (null, 'Joe', 'Smith', 'jsmith', 'password123');
*/

drop table if exists books;
create table books (
    `id` integer auto_increment primary key,
    `title` varchar(55),
    `author` varchar(55),
    `isbn` varchar(17)
);

/*
--Test values:
insert into books values (null, '0-395-17711-1', 'Hobbit, The', 'Tolkien, J.R.R.');
*/


drop table if exists books_checked_out;
create table books_checked_out (
    `id` integer auto_increment primary key,
    `book_id` integer,
    `member_id` integer,
    `due_date` date
);

/*
--Test values:
insert into books_checked_out values (null, 1, 1, '2022-11-30');
*/