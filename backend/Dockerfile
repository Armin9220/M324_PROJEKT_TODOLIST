# Build Stage
FROM maven:3.9-eclipse-temurin-21-alpine AS build
COPY src /tmp/src
COPY pom.xml /tmp
RUN mvn -f /tmp/pom.xml clean package -DskipTests

# Deployment Stage
FROM eclipse-temurin:21
COPY --from=build /tmp/target/*.jar todolist_backend.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "todolist_backend.jar"]
