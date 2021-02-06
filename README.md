# Demo Spring Boot application 
This project used to demonstrate registering of services with Spring cloud eureka-discovery-server

### To Build project:
run mvn clean install

### Steps:
To check the service getting registered with service discovery, we need to run the service discovery on our machine, You can find project in my repo [eureka-service-discovery](https://github.com/santoshmv121/eureka-discovery-server)

* Step 1: Launch service discovery
* Step 2: Update the service discovery end point in properties/yaml file of sample service (eureka.client.service-url.defaultZone=http://localhost:8761/eureka)
* Step 3: We can find the status of application registering with service discovery on service discovery dashboard (http://localhost:8761/)
