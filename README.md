# JavaPractice

## Week 1: 

Exercise 1:  
Create a program that will populate and print array a = [5,7,6,9,8,1,-15,2,6] and calculate sum 

Exercise 2:  
Create a program that will calculate avg. sum for array a = [5,7,6,9,8,1,-15,2,6]

Exercise 3:  
Create array c from arrays a and b using this formula. Create separate method for max and for calculating c

![image](https://github.com/Aadi-Tyagi/JavaPractice/assets/87977583/a9aecc57-5201-44db-ba1d-93f3558b4756) ![image](https://github.com/Aadi-Tyagi/JavaPractice/assets/87977583/c12bbe9c-4476-4a82-b531-af36fea35452)

![image](https://github.com/Aadi-Tyagi/JavaPractice/assets/87977583/b3839db0-ada4-4bf7-ab34-94d95d2c4fd6)


Exercise 4:  
For String “Welcome to Clarivate!” create a method which will calculate length of String.

Exercise 5:  
Create a CSV file with mentor/mentee table mentioned above.
- a. The program will read this csv file.
- b. It will ask an input from user
- c. After the user enters any character, the program will search if mentee contains this character, and shows the name of mentors.
- d. For example, if user enter the character “a”, program shows all mentors name since all the mentees have the character “a” in the name. If user enter the character “bo”, program will show only aleksandar.mladenovic@clarivate.com since only boby.kumari@clarivate.com has the characters “bo” in the name.
- e. Add verification if the entered email addresses are indeed “Clarivate” email and it is correct mail formatting. “aaaa@gmail” is not a valid email since, it doesn’t have “.com” or any other domain name at the end. Use regex to check the email.

## Week 2:

Exercise 1:  
Create a BankAccount class where each account has an associated balance. Implement a constructor that allows you to set an initial balance when creating an account. For instance, you can create an account with $1000 initial balance or another with a default $0 balance.  
Example:
- Create an account with an initial balance of $1000.
- Create an account with a default initial balance of $0.

Exercise 2:  
Create a Shape class that can represent different geometrical shapes. Each shape has a name and a color. You can create shapes like circles or rectangles with specific names and colors.  
Example:
- Create a red circle.
- Create a blue rectangle.

Exercise 3:   
Design a set of classes to handle different shapes. There is a base class called Shape which has methods to calculate the area and perimeter. Derive classes like Circle, Rectangle, and Triangle from Shape. Each derived class will have specific methods to calculate its area and perimeter.  
Example:
- Calculate the area and perimeter of a circle with radius 5.
- Calculate the area and perimeter of a rectangle with length 4 units and width 6 units.

Exercise 4:  
Define an interface named Drawable that has a method called draw(). Implement this interface in classes like Circle, Rectangle, and Triangle. This will allow you to draw each shape using the same method.  
Example:
- Draw a circle.
- Draw a rectangle.
- Draw a triangle.

Exercise 5:  
Create a package structure for an e-commerce system. Inside, define classes like Product, Customer, Order, and ShoppingCart. You can create example instances of these classes to represent products, customers, orders, and shopping carts.  
Example:
- Add a product named "Product A" with a price of $100.0.
- Create a customer named "John Doe".
- Place an order for customer "John Doe".

Exercise 6:  
Develop an abstract class named Employee which contains attributes like name and salary, and a method calculateSalary(). Subclass this abstract class to create Manager and Developer classes, and implement the calculateSalary() method in each subclass.  
Example:
- Create a manager named "Alice" with a salary of $80,000.
- Create a developer named "Bob" with a salary of $60,000.

Exercise 7:  
Design an abstract class named Shape with methods to calculate the area and perimeter. Create subclasses like Circle, Rectangle, and Triangle to implement these methods according to the specific shape.  
Example:
- Calculate the area and perimeter of a circle with radius 5.
- Calculate the area and perimeter of a rectangle with length 4 units and width 6 units. 

Exercise 8:  
Define an interface named SortingAlgorithm with methods representing different sorting algorithms like bubble sort, merge sort, and quicksort. Implement this interface in separate classes.  
Example:
- Implement the bubble sort algorithm.
- Implement the merge sort algorithm.
- Implement the quicksort algorithm.  

Exercise 9:  
Create a Logger interface with methods for logging messages at various levels like info, warning, and error. Implement this interface in classes for logging to the console, a file, and a database.  
Example:
- Log an informational message.
- Log a warning message.
- Log an error message.

## Week 3: 

### Excercise 1:  
#### Create a Maven Project:
- Use the command-line or an IDE to create a new Maven project named HelloMaven.
- Ensure the project structure includes a src folder with main and test subdirectories.  
#### Add Dependencies:
- Open pom.xml and add a dependency for junit to enable testing.  
#### Create a Java Class:
- Inside src/main/java, create a class HelloMavenApp with a main method that prints "Hello, Maven!".  
#### Build and Run:
- Use the Maven commands to clean, compile, and package your project.
- Execute the generated JAR file to see the output.

### Exercise 2:
Dependency Management
Scenario: You are working on a large-scale project with multiple modules. Each module has its own set of dependencies. You need to ensure that all modules are using compatible versions of shared dependencies.  
* Create a multi-module Maven project with the following modules:
  * core-module
  *  feature-module
  *  web-module
- Each module should have its own set of dependencies in its pom.xml file.
- Use Maven's dependencyManagement section to define a set of common dependencies and versions in the parent pom.xml. Ensure that all modules inherit these versions.
- In the feature-module, add a custom dependency with a specific version. Ensure it is compatible with the versions defined in the parent pom.xml.
- Verify that all modules can successfully build and run without dependency conflicts.

### Exercise 3:
#### Initialize a Spring Boot Project:
* Use Spring Initializer (https://start.spring.io/) or your IDE to create a new Spring Boot project with the following details:
  * Project: HelloSpringBoot
  * Dependencies: Spring Web
#### Create a Controller:

* Create a new class HelloController in the com.example.hellospringboot package.
* Annotate it with @RestController.
* Add a method that returns a greeting message when accessed through a GET request.
#### Run and Test:
* Start the Spring Boot application.
* Use a tool like Postman or a web browser to access the endpoint and verify that it returns the greeting message.

### Exercise 4:
### Scenario:
You are building a microservices-based application. Each microservice has its own configuration requirements, including database connections, external service URLs, and logging levels.

### Exercise: Configuration Profiles
* Create a Spring Boot application named MicroserviceA.
* Define multiple configuration profiles (e.g., dev, qa, prod) in application.properties or application.yml.
* Set different database connection properties, service URLs, and logging levels for each profile.
* Implement a REST endpoint that displays the current configuration properties.
* Test the application with different profiles and verify that it correctly loads the corresponding configurations.

### Exercise 5:
### API and Controllers
### Objective: Understand and implement RESTful APIs using Spring Boot.

#### Create a Model Class:
* Create a class Book with attributes like id, title, author, and year.
#### Create a Controller:
* Create a new class BookController in the com.example.hellospringboot package.
* Annotate it with @RestController.
* Implement methods for the following operations:
  * Get a list of all books (GET request).
  * Get a specific book by ID (GET request).
  * Add a new book (POST request).
  * Update an existing book (PUT request).
  * Delete a book by ID (DELETE request).

#### Test the API:
* Use a tool like Postman or write JUnit tests to verify the functionality of your API endpoints.
#### Optional: Data Persistence (Spring Data JPA):
* Configure an in-memory database like H2.
* Use Spring Data JPA to perform CRUD operations on the Book entity.

### Exercise 6:
### API and Controllers: Complex Data Manipulation
### Scenario:
You are developing a complex e-commerce platform. You need to implement a set of RESTful APIs to manage products, orders, and customer accounts.

### Exercise: E-commerce API
- Design and implement a set of APIs for:
- Managing products (CRUD operations).
- Placing and processing orders.
- Managing customer accounts (registration, login, profile updates).
- Implement validation for requests (e.g., ensuring a product's price is a positive number, validating order quantities).
- Use Spring Data JPA for data persistence. Define entities for products, orders, and customer accounts.
- Implement exception handling for scenarios like invalid requests, resource not found, etc.
- Write comprehensive unit tests to cover various scenarios.
- Optional: Implement JWT-based authentication for customer accounts.
