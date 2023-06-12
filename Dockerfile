FROM openjdk:17
COPY build/libs/docker-prac.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]