create table tbl_member(
     user_id varchar(50) PRIMARY KEY,
     userpw varchar(50) not null,
     user_name varchar(50) not null,
     email varchar(100),
     regdate timestamp default now(),
     updatedate timestamp default now()
     );