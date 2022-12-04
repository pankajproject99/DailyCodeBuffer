https://www.youtube.com/watch?v=BnknNTN8icw


API-GATEWAY
    spring:
  application:
    name: API-GATEWAY
  cloud:
    gateway:
      routes:
        - id : USER-SERVICE
          url: lb://USER-SERVICE
          predicates:
            - Path=/users/**
        - id : DEPARTMENT-SERVICE
          url: lb://DEPARTMENT-SERVICE
          predicates:
            - Path=/departments/**

lb: load balanced

From : Euraka link : http://localhost:8761/
Instances currently registered with Eureka
Application	        AMIs	Availability Zones	Status
API-GATEWAY	        n/a (1)	(1)	                UP (1) - LAPTOP-BS059P36:API-GATEWAY:9191
DEPARTMENT-SERVICE	n/a (1)	(1)	                UP (1) - LAPTOP-BS059P36:DEPARTMENT-SERVICE:9001
USER-SERVICE	    n/a (1)	(1)	                UP (1) - LAPTOP-BS059P36:USER-SERVICE:9002

