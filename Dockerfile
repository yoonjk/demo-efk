FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/demo-efk-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 4000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
