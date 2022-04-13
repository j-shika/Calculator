FROM openjdk:8
COPY ./target/Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Calculator1-1.0-SNAPSHOT.jar", "SciCalculator"]