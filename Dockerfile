FROM openjdk 
EXPOSE 9091
ADD target/SS-0.0.1-SNAPSHOT.jar cicd.jar
ENTRYPOINT [ "java","-jar","cicd.jar" ]
