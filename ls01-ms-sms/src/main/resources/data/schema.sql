
DROP  TABLE  IF EXISTS  tb_user;
CREATE  TABLE  tb_user (
id INTEGER NOT  NULL PRIMARY KEY ,
user_name VARCHAR(256),
password VARCHAR (128),
sex INTEGER ,
real_name VARCHAR (256),
mobile VARCHAR (128),
birthday DATE
)
