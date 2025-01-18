# Spring Boot REST API CRUD Operation

This project demonstrates a simple CRUD (Create, Read, Update, Delete) operation using Spring Boot for managing employee data.

## Project Structure

The project follows a typical Spring Boot structure:

```
Spring-Boot-Rest-API-CRUD-Operation/
|
|-- src/main/java/com/example/springbootcrud/
|   |-- controller/
|   |   |-- EmployeeController.java
|   |
|   |-- entity/
|   |   |-- Employee.java
|   |
|   |-- repository/
|   |   |-- EmployeeRepository.java
|   |
|   |-- service/
|   |   |-- EmployeeService.java
|   |   |-- EmployeeServiceImpl.java
|
|-- src/main/resources/
|   |-- application.properties
|
|-- pom.xml
|-- README.md
```

## Features

- **Create Employee**: Add a new employee using a POST request.
- **Retrieve Employees**:
  - Fetch all employees using a GET request to `/api/employees`.
  - Fetch a specific employee by ID using a GET request to `/api/employees/{id}`.
- **Update Employee**: Update an existing employee using a PUT request to `/api/employees/{id}`.
- **Delete Employee**: Remove an employee using a DELETE request to `/api/employees/{id}`.

## Endpoints

### 1. GET /api/employees
Fetches the list of all employees.

#### Response Example:
```json
[
    {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com",
        "phone": 1234567890
    }
]
```

### 2. GET /api/employees/{id}
Fetches the details of a specific employee by ID.

#### Response Example:
```json
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "phone": 1234567890
}
```

### 3. POST /api/employees
Creates a new employee.

#### Request Body:
```json
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "phone": 1234567890
}
```

#### Response Example:
```json
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "phone": 1234567890
}
```

### 4. PUT /api/employees/{id}
Updates an existing employee's details.

#### Request Body:
```json
{
    "firstName": "Jane",
    "lastName": "Smith",
    "email": "jane.smith@example.com",
    "phone": 9876543210
}
```

#### Response Example:
```json
{
    "id": 1,
    "firstName": "Jane",
    "lastName": "Smith",
    "email": "jane.smith@example.com",
    "phone": 9876543210
}
```

### 5. DELETE /api/employees/{id}
Deletes a specific employee by ID.

#### Response Example:
```
Employee with ID {id} deleted successfully.
```

## Technologies Used

- **Java 21**
- **Spring Boot 3.x**
- **Hibernate/JPA**
- **MYSQL Database** (In-memory database for development and testing)
- **Maven**
- **Postman** (For testing the API)

## How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/PraveenKumar-A02/Spring-Boot-Rest-API-CRUD-Operation.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Spring-Boot-Rest-API-CRUD-Operation
   ```

3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the API endpoints at `http://localhost:8080/api/employees`.

## Configuration

The database and other configurations are defined in the `application.properties` file:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## License

This project is licensed under the [MIT License](LICENSE).

---

Developed by Praveen Kumar A. Feel free to contribute!

