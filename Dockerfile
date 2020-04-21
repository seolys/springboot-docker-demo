FROM openjdk:8-jre

COPY target/springboot-docker-demo-*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]