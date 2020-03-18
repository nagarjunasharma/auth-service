FROM openjdk:8
EXPOSE 8080
COPY target/auth-service*.jar auth-service.jar
ENTRYPOINT [ "java", "-jar","auth-service.jar"]