# Build stage
FROM openjdk:17-jdk-slim AS build

# Set labels for metadata
LABEL description="YouPipe, an experimental YouTube clone" \
      version="latest" \
      maintainer="Jarvan Lee"
# Set the working directory
WORKDIR /app

# Copy the project files to the container
COPY mvnw .
COPY .mvn .mvn
COPY src ./src
COPY pom.xml .

# Build the application
RUN ./mvnw clean package -DskipTests

# Package stage
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the built jar file from the previous stage
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
