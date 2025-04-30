FROM openjdk:24-jdk-slim

WORKDIR /app

# Copy all source files maintaining package structure
COPY *.java ./HotelManagementSystem/

# Compile with package awareness
RUN javac HotelManagementSystem/*.java

# Run with full package qualification
CMD ["java", "HotelManagementSystem.Main2"]