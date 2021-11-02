FROM openjdk:11
MAINTAINER habibie
ENV PORT 8111
EXPOSE 8111
COPY demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo-0.0.1-SNAPSHOT.jar"]
