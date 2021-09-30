DROP TABLE IF EXISTS user;
CREATE TABLE user(
	uid BIGINT(20) primary key NOT NULL auto_increment COMMENT '主键',
    user_name VARCHAR(50) NOT NULL COMMENT "用户名",
    email VARCHAR(50) COMMENT "邮箱",
	phone VARCHAR(50) COMMENT "电话",
	idcard VARCHAR(50) COMMENT "身份证",
	birthday DATETIME COMMENT "生日",
	gender INT(4) COMMENT "性别0女1男",
	province VARCHAR(50) COMMENT "省份",
	city VARCHAR(50) COMMENT "城市",
	create_date DATETIME COMMENT "账户创建日期",
	data_change_last_time DATETIME COMMENT "记录变动最晚时间"
);
ALTER TABLE user ADD UNIQUE(phone,email,idcard);

INSERT INTO user (user_name,gender,province) VALUES ("Simon",1,"江苏");
INSERT INTO user (user_name,gender,province) VALUES ("Alex",1,"上海");

SELECT * FROM user