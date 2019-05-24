
/* Drop Tables */

DROP TABLE product CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE product
(
	product_code char(10) NOT NULL,
	product_name varchar2(100) NOT NULL,
	product_parent_code char(10) NOT NULL,
	product_lots varchar2(8) NOT NULL,
	product_spec varchar2(300) NOT NULL,
	product_description varchar2(300),
	company_code char(3) NOT NULL,
	PRIMARY KEY (product_code)
);



