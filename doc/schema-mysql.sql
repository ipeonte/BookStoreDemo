create table book (
	id int not null auto_increment,
	title varchar(255) not null,
	author varchar(255) not null,
	
	unique index author_book (title, author),
	
	primary key(id)
);

create table customer (
	id int not null auto_increment,
	name varchar(255) not null unique,
	
	primary key(id)
);

create table customer_book (
	id int not null auto_increment,
	book_id int not null,
	customer_id int not null,
	
	unique index author_book (book_id, customer_id),
	
	foreign key (book_id)
        	references book(id) on delete restrict,
	foreign key (customer_id)
        	references customer(id) on delete restrict,
        	
    primary key(id)
);
