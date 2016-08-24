Bootiful Security Step 2
========================

In step 1 an initial application with basic security 
has been created using [start.spring.io](http://start.spring.io).

Step 2 extends application of step1.   
 
The application of step 2 includes

- One REST api endpoint at [localhost:8080/step2/user](http://localhost:8080/step2/user)
- Login (now) using authentication with form login
- In-memory configuration for users:
  - Username _user_, password _secret_ with role _USER_
  - Username _admin_, password _secret_ with role _ADMIN_
- Security for all endpoints
- Protection for session fixation
- Protection for CSRF
- Integration Test to verify form login authentication
- Integration Test to verify REST API with security 

Start the application using class _com.example.security.Step2Application_
and navigate your browser to [localhost:8080/step2/user](http://localhost:8080/step2/user).
 