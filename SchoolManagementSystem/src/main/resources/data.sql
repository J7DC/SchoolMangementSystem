create table USER
(
   ID integer not null  AUTO_INCREMENT,
   USERID varchar(255) not null, 
   PASSWORD varchar(255) not null,
   DATE varchar(255) not null,
   ROLE varchar(255) not null,
   primary key(id)
);
insert into USER (DATE,PASSWORD, ROLE, USERID, ID) values ('16/07/2020','j7dc123','student','user1',1);
insert into USER (DATE,PASSWORD, ROLE, USERID, ID) values ('16/07/2020','j7dc123','teacher','user2',2);
insert into USER (DATE,PASSWORD, ROLE, USERID, ID) values ('16/07/2020','j7dc123','staff','user3',3);

create table STUDENT
(
   ID integer not null  AUTO_INCREMENT,
   USERID varchar(255) not null, 
   ROLL_NUMBER varchar(255) not null,
   FIRST_NAME varchar(255) not null,
   LAST_NAME varchar(255) not null,
   FATHER_NAME varchar(255) not null,
   AGE  integer not null,
   SEX varchar(255) not null,
   IMAGE varchar(255) not null,
   ADDRESS varchar(255) not null,
   CONTACT_NUMBER varchar(255) not null,
   EMAIL varchar(255) not null,
      primary key(id)
);
insert into STUDENT (ID,USERID,ROLL_NUMBER, FIRST_NAME,LAST_NAME,FATHER_NAME, AGE,SEX, IMAGE, ADDRESS, CONTACT_NUMBER, EMAIL   ) 
values (1, 'user1','01','Samar','Alam', 'Alam',22,'M','image2','10/4 , Street',  '9987654321', 'sample@gmail.com');
insert into STUDENT (ID,USERID,ROLL_NUMBER, FIRST_NAME,LAST_NAME,FATHER_NAME, AGE,SEX, IMAGE, ADDRESS, CONTACT_NUMBER, EMAIL   ) 
values (2, 'user2','02','Akash','Kumar', 'Kumar',23,'M','image2','10/4 , Street',  '9987654321', 'sample@gmail.com');

create table REGISTRATION
(
   ID integer not null  AUTO_INCREMENT,
   USERID varchar(255) not null,
   FIRST_NAME varchar(255) not null,
   LAST_NAME varchar(255) not null,
   FATHER_NAME varchar(255) not null,
   AGE  integer not null,
   SEX varchar(255) not null,
   IMAGE varchar(255) not null,
   ADDRESS varchar(255) not null,
   CONTACT_NUMBER varchar(255) not null,
   EMAIL varchar(255) not null,
      primary key(id)
);