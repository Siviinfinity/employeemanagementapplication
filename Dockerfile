FROM openjdk:11-jre-slim
VOLUME /tmp
COPY target/employeeapi.jar employeeapi.jar
ENTRYPOINT ["java","-jar","/employeeapi.jar"]