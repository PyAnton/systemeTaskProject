FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/systemeTaskProject-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8337

ENTRYPOINT ["java", "-jar", "app.jar"]