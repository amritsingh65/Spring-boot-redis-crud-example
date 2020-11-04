# Spring-boot-redis-crud-example

The purpose of this repository for knowledge sharing to use spring boot with redis that has a crud operation implemented in this repository.

Steps to use this repository.

1. Install Redis server in your dev environment https://redis.io/download - for unbuntu/Linux users.

2. Clone the Spring-boot-redis-crud-example repository to your dev enviornment.

3. Once you install the redis in your dev environment. Start your redis service.

4. open terminal and go to the project path and run -<strong> mvn clean spring-boot:run </strong>

5. Use postman or any tool to send requests to your api.

6. Check the user.java class in the project to send the parameters in your request.


Here are the urls used:

<strong> for saving a user - http://localhost:8081/user </strong> and pass the user parameters in the body
<strong> for lists all users - http://localhost:8081/users </strong>
<strong> for fetting a single user - http://localhost:8081/user/{userId} </strong> and pass the usedid in the path.
<strong> for deleting a user - http://localhost:8081/user/delete/{userId} </strong> and pass the userId in the path




Happy Learning and wait for more to come!!

Cheers
