FROM openjdk:24-jdk-slim

WORKDIR /app

# Copy all source files maintaining package structure
COPY *.java ./ConstructionManagementSystem/

# Compile with package awareness
RUN javac ConstructionManagementSystem/*.java

# Run with full package qualification
CMD ["java", "ConstructionManagementSystem.Main1"]