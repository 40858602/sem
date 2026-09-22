FROM eclipse-temurin:25-jdk

COPY target/seMethods-0.1.0.1-jar-with-dependencies.jar-jar-with-dependencies.jar /tmp/

WORKDIR /tmp

ENTRYPOINT ["java", "-jar", "seMethod-0.1.0.1-jar-with-dependencies.jar"]