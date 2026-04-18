# 📚 BookStore Backend Application

A **microservices-based backend system** for an online BookStore, built using **Spring Boot, Spring Cloud, and JPA**.
The application provides REST APIs for managing books, users, carts, and orders in a **distributed architecture**.

---

## 🚀 Features

* User Registration & Authentication APIs (JWT-based)
* Book Management (Add, Update, Delete, Fetch)
* Cart Management APIs
* Order Processing APIs
* Inter-service communication using OpenFeign
* Service discovery using Eureka
* RESTful API design

---

## 🏗️ Architecture

This project follows a **microservices architecture** where each module is an independent service.

### 🔧 Services

* **eureka-server** → Service registry
* **user-service1** → User management & authentication
* **book-service** → Book catalog management
* **cart-service** → Cart operations
* **order-service** → Order processing
* **common-api** → Shared DTOs and contracts

---

## 🏗️ Tech Stack

### Backend

* Java 21
* Spring Boot 3
* Spring Cloud (Eureka, OpenFeign)
* Spring Data JPA
* Hibernate

### Database

* MySQL / H2

### Security

* JWT (Auth0)

### Tools

* Maven
* Git & GitHub

---

## 📂 Project Structure

```id="code1"
BookStoreApp/
│
├── book-service/
├── cart-service/
├── order-service/
├── user-service1/
├── common-api/
├── eureka-server/
│
├── pom.xml        # Container project (not aggregator)
└── README.md
```

---

## ⚠️ Important Note

* Each service is an **independent Spring Boot application**
* Root `pom.xml` is used only as a **container project**
* Services must be **built and run individually**

---

## ⚙️ Setup & Installation

### 1. Clone the Repository

```bash id="code2"
git clone https://github.com/sagarchavan07/BookStoreApp.git
cd BookStoreApp
```

---

### 2. Configure Database

Update `application.properties` in each service:

```properties id="code3"
spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3. Build the Services

Each service should be built individually:

```bash id="code4"
cd eureka-server && mvn clean install
cd ../user-service1 && mvn clean install
cd ../book-service && mvn clean install
cd ../cart-service && mvn clean install
cd ../order-service && mvn clean install
```

---

### 4. Run the Application

Start services in order:

1. Eureka Server
2. user-service1
3. book-service
4. cart-service
5. order-service

---

### 5. Access Services

* Eureka Dashboard:
  http://localhost:8761

* APIs exposed via respective services (ports configured per service)

---

## 🔗 Sample API Endpoints

### Book Service

* GET /books → Get all books
* GET /books/{id} → Get book by ID
* POST /books → Add new book
* PUT /books/{id} → Update book
* DELETE /books/{id} → Delete book

### Order Service

* POST /orders → Create order
* GET /orders/{id} → Get order details

---

## 🔄 Inter-Service Communication

* Implemented using **OpenFeign**
* Services communicate via **Eureka service discovery**
* No hardcoded URLs between services

---

## 🔐 Security

* JWT-based authentication using `java-jwt`
* Token-based request validation across services

---

## 🧪 Future Enhancements

* API Gateway (Spring Cloud Gateway)
* Centralized Configuration Server
* Resilience & Fault Tolerance (Resilience4j)
* Swagger API Documentation
* Docker Deployment

---

## ⚠️ Known Limitations

* No API Gateway (currently in development)
* No centralized configuration (in progress)
* Limited validation and exception handling

---

## 🤝 Contributing

1. Fork the repository
2. Create a new branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

---

## 📄 License

This project is for learning and demonstration purposes.

---

## 👨‍💻 Author

Sagar Chavan
GitHub: https://github.com/sagarchavan07

---

## ⭐ Support

If you like this project, give it a star on GitHub!
