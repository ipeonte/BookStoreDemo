# BookStore Demo

Very simple Book Storage with REST API only (no UI)

## What is available
- Rest API

## What is missing

- UI
- Code comments
- Error handling
- Integration & Unit Tests
- Input Data Validation

## Build

```
mvn clean install
```

## Run

```
cd BookStoreDemo
java -jar target/bookstore-demo-1.0.0.jar
```
Open Postman and navigate on http://localhost:8080/

## Exposed API

### Book

- List all books (optionally with customers who borrowed book)

<i>books GET</i>

![List all books](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/list_books.png)

- Create Book

<i>/books POST</i>

![Create Book](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/create_book.png)

- Update Book

<i>/books/{id} PUT</i>

![Update Book](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/update_book.png)

- Delete Book (if not handled by customer)

<i>/books/{id} DELETE</i>

![Delete Book Step 1](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/delete_book_1.png)

![Delete Book Step 2](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/delete_book_2.png)

### Customer

- List all Customers (optionally with used books)

<i>customers GET</i>

![List all Customers](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/list_customers.png)

- Create Customer

<i>/customers POST</i>

![Create Customer](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/create_customer.png)

- Update Customer

<i>/customers/{id} PUT</i>

![Update Customer](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/update_customer.png)

- Delete Customer (if not own any book)

<i>/customers/{id} DELETE</i>

![Delete Customer Step 1](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/delete_customer_1.png)

![Delete Customer Step 2](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/delete_customer_2.png)

### Customer Books

- Add Book to Customer

<i>/customers/{cust_id}/books/{book_id} POST</i>

![Add Book to Customer](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/add_customer_book.png)

- Remove Book from Customer

<i>/customers/{cust_id}/books/{book_id} DELETE</i>

![Remove Book to Customer](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/img/remove_customer_book.png)
