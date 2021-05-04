CREATE TABLE user_acct(
	username varchar(25),
	password varchar(25) not null,
	email_address varchar(50) unique not null,
	first_name varchar(25) not null,
	last_name varchar(25) not null,
	primary key(username)
);


CREATE TABLE client(
	client_id serial,
	address varchar(50) not null,
	date_of_birth date not null,
	social_security_num varchar(11) not null,
	client_signup_date date not null,
	username varchar(25) REFERENCES user_acct(username),
	primary key(client_id)
);

CREATE TABLE employee(
	employee_id serial,
	address varchar(50) not null,
	date_of_birth date not null,
	social_security_num varchar(11) not null,
	hire_date date not null,
	username varchar(25) REFERENCES user_acct(username),
	primary key(employee_id)
	
);

CREATE TABLE bank_acct(
	acct_num integer,
	client_id integer REFERENCES client(client_id),
	acct_type varchar(15),
	balance decimal,
	PRIMARY key(acct_num)
);

CREATE TABLE transaction(
	transaction_id serial,
	acct_num integer REFERENCES bank_acct(acct_num),
	transaction_timestamp timestamp,
	description varchar(100),
	start_balance decimal,
	end_balance decimal,
	PRIMARY key(transaction_id)
);


