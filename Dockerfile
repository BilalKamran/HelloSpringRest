FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY /target/demo-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "demo.jar"]