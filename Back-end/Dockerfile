FROM openjdk:your-version-JDK 
# Your port
EXPOSE 8080 
WORKDIR /usr/local/bin/your-artifact-name
ADD target/your-artifact-name.jar .
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","your-artifact-name.jar"]

