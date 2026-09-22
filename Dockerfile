FROM eclipse-temurin:25-jdk
COPY ./target/seMethods-0.1.0.2-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "devops-0.1.0.1-jar-with-dependencies.jar"]