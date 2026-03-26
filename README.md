# Login Auth Api

**Tagline**: Java Spring Boot project focused on JWT-based authentication.

## Description


Application developed in **Java** with **Spring Boot** that demonstrates, in practice, authentication and authorization concepts using **JWT** (JSON Web Token).

The project includes full features for user **registration**, **login**, **logout**, and a**ccess control for protected routes**. It also implements secure token storage using **cookies** and a **refresh token** mechanism for session renewal.

The API provides interactive documentation with **Swagger**, making it easier to explore and test the endpoints.

## Project Status

Completed

## Technologies Used

-   **Java 21**
-   **Spring Boot 3**
    -   Spring Web
    -   Spring Security
    -   Spring Data JPA
-   **JWT (JSON Web Token)** – using Auth0 Java JWT
-   **H2 Database** (in-memory database for development/testing)
-   **Lombok** (to reduce boilerplate code)
-   **Swagger (Springdoc OpenAPI)** – interactive API documentation
-   **Maven** – dependency management and build tool

## Installation
To install the project, you must:

```bash
git clone https://github.com/gustavorods/login_auth_api.git
cd login_auth_api
```

After that, you can configure the application.properties file if you want.
```bash
spring.application.name=login_auth_api  
spring.datasource.url=jdbc:h2:mem:testdb  
spring.datasource.driver-class-name=org.h2.Driver  
spring.datasource.username=gu  
spring.datasource.password=  
  
api.security.token.secret=net123
```

**Note:** If you want to connect the project to a front-end, remember to configure CORS in
```bash
 gustavorods.login_auth_api > infra > cors > CorsConfig;
```

## Usage

To run the project, use:

```bash
mvn spring-boot:run
```
The application will be available at:

http://localhost:8080

Swagger documentation can be accessed at:

http://localhost:8080/swagger-ui/index.html

## Contributing
Contributions are welcome! This project is open to improvements, including bug fixes, performance enhancements, and new features.

**Please follow these steps:**

-   Fork the repository
-   Create a new branch
-   Make your changes
-   Commit with clear messages
-   Push your branch
-   Open a Pull Request describing your changes

## License
This project is licensed under the MIT License.  
You are free to use, modify, and distribute this software in accordance with the license terms.

## Recommendation
If you want to build a similar project with JWT authentication and frontend integration, this video is a great reference:

[Fullstack project with login using Spring Security + JWT | Backend](https://youtube.com.br/embed/go-VJzRqacE?utm_source=chatgpt.com)

This tutorial walks through the complete flow, including authentication, token handling, and frontend-backend communication.