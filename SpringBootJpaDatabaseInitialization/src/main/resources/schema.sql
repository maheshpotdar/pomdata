drop table if exists employee;
create table employee
(
eid integer not null auto_increment,
ename vachar(255),
email vachar(255),
salary double,
primary key(eid)
);