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