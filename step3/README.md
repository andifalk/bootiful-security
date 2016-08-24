Bootiful Security Step 3
========================

In step 1 an initial application with basic security 
has been created using [start.spring.io](http://start.spring.io).

Step 2 extended the application of step1 with form login authentication.
In step 3 method level security (with tests) is introduced to the application.   
 
The application of step 3 now includes

- An index page at [localhost:8080/step3](http://localhost:8080/step3)
- A REST api endpoint at [localhost:8080/step3/user](http://localhost:8080/step3/user) accessable with roles _USER_ 
and _ADMIN_
- A REST api endpoint at [localhost:8080/step3/admin](http://localhost:8080/step3/admin) accessable with role _ADMIN_
- Login using authentication with form login
- Logout via link at [localhost:8080/step3](http://localhost:8080/step3)
- Customized error pages for 403 and 404 errors
- In-memory configuration for users:
  - Username _user_, password _secret_ with role _USER_
  - Username _admin_, password _secret_ with role _ADMIN_
- Security for all endpoints
- Protection for session fixation
- Protection for CSRF 
- Integration Test to verify form login authentication and logout
- Integration Test to verify REST API with security (authentication __and__ authorization) 

Start the application using class _com.example.security.Step3Application_
and navigate your browser to [localhost:8080/step3](http://localhost:8080/step3).
 