FROM openjdk:21-jdk-slim
# Set the working directory
WORKDIR /app
# Copy the JAR file into the container
COPY target/rate-limter-api-0.0.1-SNAPSHOT.jar app.jar
# Expose the port the app runs on
EXPOSE 8080
# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]