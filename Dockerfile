#FROM gradle AS builder
#COPY --chown=gradle:gradle . /home/gradle/src
#WORKDIR /home/gradle/src
#RUN gradle clean build --no-daemon

FROM openjdk
EXPOSE 8080
#RUN mkdir /app
COPY /build/libs/springboot-docker-template-0.0.1-SNAPSHOT.jar /springboot-docker-template-0.0.1-SNAPSHOT.jar

# ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

CMD ["java", "-XshowSettings:vm", "-XX:+UnlockExperimentalVMOptions", "-Djava.security.egd=file:/dev/./urandom", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/springboot-docker-template-0.0.1-SNAPSHOT.jar"]