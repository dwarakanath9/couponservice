FROM openjdk:11.0.3
EXPOSE 8080
ADD target/springboot-dwarakanath.jar springboot-dwarakanath.jar
ENTRYPOINT ["java","-jar","/springboot-dwarakanath.jar"]
