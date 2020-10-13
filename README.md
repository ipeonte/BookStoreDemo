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

## Exposed API

### Book

- List all books (optionally with customers who borrowed book)
/books GET

![List all books](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/list_books.png)

- Create Book
/books POST

![Create Book](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/create_book.png)

- Update Book
/books/{id} PUT

![Update Book](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/update_book.png)

- Delete Book (if not handled by customer)
/books/{id} DELETE

![Delete Book](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/delete_book.png)

### Customer

- List all Customers (optionally with used books)
/customers GET

![List all Customers](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/list_customers.png)

- Create Customer
/customers POST

![Create Customer](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/create_customer.png)

- Update Customer
/customers/{id} PUT

![Update Customer](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/update_customer.png)

- Delete Customer (if not own any book)
/customers/{id} DELETE

![Delete Customer](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/delete_customer.png)

### Customer Books

- Add Book to Customer
/customers/{cust_id}/books/{book_id} POST

![Add Book to Customer](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/add_customer_book.png)

- Remove Book from Customer
/customers/{cust_id}/books/{book_id} DELETE

![Remove Book to Customer](https://github.com/ipeonte/BookStoreDemo/blob/master/doc/remove_customer_book.png)
