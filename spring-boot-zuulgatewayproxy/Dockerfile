FROM openjdk:11
ADD ./target/spring-boot-zuulgatewayproxy-0.0.1-SNAPSHOT.jar /usr/src/spring-boot-zuulgatewayproxy-0.0.1-SNAPSHOT.jar
EXPOSE 8090
WORKDIR usr/src
ENTRYPOINT ["java","-jar","spring-boot-zuulgatewayproxy-0.0.1-SNAPSHOT.jar"]
