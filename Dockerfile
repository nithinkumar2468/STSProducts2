FROM openjdk:17
EXPOSE 8081
ADD target/spring-boot-products.jar spring-boot-products.jar
ENTRYPOINT ["java","-jar","/spring-boot-products.jar","--spring.config.location=/src/main/resources/application.properties"]