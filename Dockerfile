FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/*.jar /app/

ENTRYPOINT ["java", "-jar", "/app/AI_INSight-0.0.1-SNAPSHOT.jar"]

