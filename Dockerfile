# Use OpenJDK 17 (Temurin JDK)
FROM eclipse-temurin:17-jdk-focal

# Set working directory
WORKDIR /app

# Copy Maven wrapper & pom.xml first (for efficient caching)
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

# Copy the rest of the application source code
COPY src ./src

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose the application port
EXPOSE 9193

# Run the application using the built JAR
CMD ["java", "-jar", "target/easyshop-0.0.1-SNAPSHOT.jar"]
