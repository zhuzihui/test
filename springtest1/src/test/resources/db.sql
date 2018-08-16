create database test6;
use test6;
create table users(
	id int primary key auto_increment,
	username VARCHAR(50),
	password VARCHAR(50)
	
)
insert into users ( username,password)values ( 'a','a');

select * from users