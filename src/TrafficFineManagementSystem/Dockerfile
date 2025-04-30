FROM openjdk:24-jdk-slim

WORKDIR /app

# Copy all source files maintaining package structure
COPY *.java ./TrafficFineManagementSystem/

# Compile with package awareness
RUN javac TrafficFineManagementSystem/*.java

# Run with full package qualification
CMD ["java", "TrafficFineManagementSystem.Main3"]