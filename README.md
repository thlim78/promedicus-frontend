Overview
========
This promedicus-frontend is developed using the latest spring-boot v2.1.14 and thymeleaf web framework. It requires Java 8 to build and run. It has been configured to communicate with the backend's rest-endpoints via port 8080. It listens on port 8082 and its context path is defined as /admission-frontend. 

a. http://localhost:8082/admission-frontend/ - load index page showing a list of admissions.

b. http://localhost:8080/admission-frontend/create - load create admission form page.

c. http://localhost:8080/admission-frontend/add - to add a new admission record.

d. http://localhost:8080/admission-frontend/edit/{id} - load update admission form page.

e. http://localhost:8080/admission-frontend/update/{id} - update an existing admission record by id.

f. http://localhost:8080/admission-frontend/delete/{id} - delete admission record by id.


Steps to set up the project
===========================
1. Start the promedicus-backend project first.
1. mvn clean install
2. java -jar target/promedicus-frontend-0.0.1-SNAPSHOT.jar
