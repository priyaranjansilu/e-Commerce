# Use an OpenJDK base image
FROM openjdk:21-jdk-slim

COPY . /app
# Set the working directory inside the container
WORKDIR /app

# Copy the  Maven build output (JAR file) into the container
COPY target/*.jar app.jar

# Expose the default port Spring Boot runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
