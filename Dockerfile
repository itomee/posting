FROM alpine
RUN apk add openjdk17
WORKDIR /service
COPY ./build/libs/HttpEchoService-0.0.1-SNAPSHOT.jar service.jar
CMD ["java", "-jar", "service.jar" ]
