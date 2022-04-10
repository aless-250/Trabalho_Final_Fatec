#deletar usuario davi
drop user 'davi'@'%';
#verificar se o usuario davi existe
select user from mysql.user;
#criar usuario davi
CREATE USER 'teste'@'localhost' IDENTIFIED BY 'teste';
#verificar se o usuario davi existe
select user from mysql.user;
#grant all privileges to davi
GRANT ALL PRIVILEGES ON *.* TO 'teste'@'localhost' WITH GRANT OPTION;
flush privileges;