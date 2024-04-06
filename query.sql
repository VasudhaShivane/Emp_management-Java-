create database project3;

use project3;
create table login(username varchar (50) , password varchar (50));
insert into login values("admin" , "pass@123");
select * from login;

create table employee( name VARCHAR(50), fname varchar(50) ,  age varchar(50) ,dob varchar (50), address varchar(50), phone varchar(40), email varchar(40) ,education varchar(50), job varchar(30),  adhar varchar(50),empid varchar(40) );
select * from employee;
drop table employee;
