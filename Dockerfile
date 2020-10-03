FROM openjdk:8
EXPOSE 8080
ADD target/expense-tracker-0.0.1-SNAPSHOT.jar expense-tracker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/expense-tracker-0.0.1-SNAPSHOT.jar"]