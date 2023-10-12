# Spring boot microservices studying
## Microservices project having the following components
 - students
 - school
 - api gateway
 - service discovery (using eureka)
 - centralized tracing using (Zipkin)
 - actuators to expose microservice metrics
## Dependencies for API gateway
 - Gateway: 
Route to APIs and provide cross-cutting concerns to them such as security, monitoring/metrics, and resiliency.
 - Eureka Discovery Client:
A REST based service for locating services for the purpose of load balancing and failover of middle-tier servers.
 - Config Client SPRING:
 Client that connects to a Spring Cloud Config Server to fetch the application's configuration.
 - Spring Boot Actuator OPS:
   Supports built in (or custom) endpoints that let you monitor and manage your application - such as application health, metrics, sessions
## Dependencies for discovery service
- Eureka Server:
spring-cloud-netflix Eureka Server.
- Config Client:
Client that connects to a Spring Cloud Config Server to fetch the application's configuration.
- Spring Boot Actuator:
Supports built in (or custom) endpoints that let you monitor and manage your application - such as application health, metrics, sessions, etc.
## Dependencies for config server
 - Config Server: Central management for configuration via Git, SVN, or HashiCorp Vault.
## Dependencies for business apps : [student]
 - Config Client: for reading configuration from config server
 - Eureka Discovery Client: For registering with discovery service
 - Spring Boot Actuator: for health metrics
