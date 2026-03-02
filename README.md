# 💫 About Me:
A web application to manage student records (Add, View, Update, Delete, Search) using Spring Boot, Thymeleaf, and MySQL.


# 💻 Tech Stack:
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Thymeleaf](https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white) ![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white) ![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)
# 📊 GitHub Stats:
![](https://github-readme-stats.vercel.app/api?username=sms&theme=dark&hide_border=false&include_all_commits=false&count_private=false)<br/>
![](https://nirzak-streak-stats.vercel.app/?user=sms&theme=dark&hide_border=false)<br/>
![](https://github-readme-stats.vercel.app/api/top-langs/?username=sms&theme=dark&hide_border=false&include_all_commits=false&count_private=false&layout=compact)



📚 Student Management System

Technology Stack: Spring Boot | Thymeleaf | MySQL | MVC Architecture

🔹 Project Overview

The Student Management System is a full-stack web application developed using Spring Boot for backend development, Thymeleaf for frontend templating, and MySQL as the relational database.

The application allows administrators to:

Add new students

View student list

Update student details

Delete student records

Search students

It follows the MVC (Model-View-Controller) architecture to ensure clean separation of concerns.


🔹Core Features Implementation

✅ 1. Add Student

Form created using Thymeleaf

Data submitted via POST request

Controller saves data using service

Stored in MySQL database

Flow:
User → Form → Controller → Service → Repository → Database

✅ 2. View Students

Fetch all students using findAll()

Display in table format

Dynamic rendering using Thymeleaf

✅ 3. Update Student

Fetch student by ID

Populate form with existing data

Save updated details

JPA automatically performs update

✅ 4. Delete Student

Delete using student ID

Repository method: deleteById(id)

✅ 5. Search Student

Implemented using:

List<Student> findByFirstNameContaining(String keyword);

Allows partial search

Uses Spring Data JPA query method

🔹 Database Design (MySQL)

Table: students

Column Name	Type
id	BIGINT (PK)
first_name	VARCHAR
last_name	VARCHAR
email	VARCHAR

Spring Boot configuration (application.properties):

spring.datasource.url=jdbc:mysql://localhost:3306/student_db

spring.datasource.username=root

spring.datasource.password=******

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

🔹 Tools & Dependencies Used

Spring Boot Starter Web

Spring Boot Starter Thymeleaf

Spring Boot Starter Data JPA

MySQL Driver

Lombok (optional)

Maven

🔹 How MVC Helps

✔ Separation of concerns

✔ Easy debugging

✔ Clean code structure

✔ Scalable and maintainable

✔ Easy to add new features

🔹 Challenges Faced

Handling form validation

Managing null values during update

Configuring MySQL connection

Handling template errors in Thymeleaf

🔹 Improvements / Future Enhancements

Add Spring Security (Login/Role-based access)

Pagination using Pageable

REST API version

Deployment on AWS

Add sorting feature

Add validation using @Valid

PHASE 1: Project Setup 🚀

Step 1: Install Prerequisites

1. Download and install Java JDK 17+
2. Install MySQL Database
3. Install IntelliJ IDEA or Eclipse
4. Install Maven
5. Install Git (optional)

Step 2: Create Spring Boot Project

Option A - Using Spring Initializr (Website):
1. Go to start.spring.io
2. Fill project metadata:
   - Project: Maven
   - Language: Java
   - Spring Boot: Latest stable
   - Group: com.example
   - Artifact: student-management
3. Add dependencies:
   - Spring Web
   - Thymeleaf
   - Spring Data JPA
   - MySQL Driver
   - Validation
   - Lombok
4. Generate and download project
5. Extract and open in IDE

Option B - Using IDE:
1. Open IntelliJ IDEA
2. File → New → Project
3. Select Spring Initializr
4. Follow same steps as above

PHASE 2: Database Setup 🗄️

Step 3: Create Database

1. Open MySQL Command Line or Workbench
2. Create database: CREATE DATABASE student_db;
3. Verify: SHOW DATABASES;

Step 4: Configure Database Connection

Edit application.properties file and add:
1. Database URL (jdbc:mysql://localhost:3306/student_db)
2. Username (root)
3. Password (your password)
4. JPA/Hibernate settings

PHASE 3: Project Structure 📁

Step 5: Create Package Structure

Create these packages in your project:
1. com.example.studentmanagement.model
2. com.example.studentmanagement.repository  
3. com.example.studentmanagement.service
4. com.example.studentmanagement.controller
5. com.example.studentmanagement.dto (optional)

PHASE 4: Implementation Steps 💻

Step 6: Create Model/Entity Layer

1. Create Student class in model package
2. Add JPA annotations (@Entity, @Table)
3. Define attributes:
   - id (Primary key)
   - firstName
   - lastName  
   - email
   - course
   - phoneNumber
   - enrollmentDate
4. Add validation annotations
5. Generate constructors, getters, setters

Step 7: Create Repository Layer

1. Create StudentRepository interface
2. Extend JpaRepository
3. Add custom query methods:
   - Find by name
   - Search functionality
   - Check email exists

Step 8: Create Service Layer

1. Create StudentService interface
2. Define CRUD methods
3. Create implementation class
4. Add business logic:
   - Save student
   - Get all students
   - Get student by ID
   - Update student
   - Delete student
   - Search students
   - Pagination

Step 9: Create Controller Layer

1. Create StudentController class
2. Define request mappings:
   - GET / - Home page
   - GET /new - Show add form
   - POST /save - Save student
   - GET /edit/{id} - Show edit form
   - POST /update/{id} - Update student
   - GET /delete/{id} - Delete student
   - GET /search - Search students
   - GET /page/{pageNo} - Pagination

Step 10: Create View Layer (Thymeleaf)

Create HTML templates in templates folder:
1. index.html - Main page with student list
2. student_form.html - Add/Edit form
3. student_details.html - View details
4. fragments/common.html - Reusable components

Add Bootstrap for styling:
- Include Bootstrap CSS
- Add responsive design
- Use Bootstrap components

PHASE 5: Deployment 🚀

Step 17: Build Application

1. Clean project: mvn clean
2. Build JAR: mvn package
3. Find JAR in target folder

Step 18: Run Application

Option A - Using IDE:
   Run main application class

Option B - Using command line:
   java -jar student-management.jar

Option C - Deploy to cloud:
   Deploy on AWS, Heroku, or Railway

Learning Resources 📚

Documentation
Spring Boot: https://spring.io/projects/spring-boot

Thymeleaf: https://www.thymeleaf.org
