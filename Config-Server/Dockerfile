FROM openjdk:11
ADD ./target/Config-Server-0.0.1-SNAPSHOT.jar /usr/src/Config-Server-0.0.1-SNAPSHOT.jar
EXPOSE 8888
WORKDIR usr/src
ENTRYPOINT ["java","-jar","Config-Server-0.0.1-SNAPSHOT.jar"]
