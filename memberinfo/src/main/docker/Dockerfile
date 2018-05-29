FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD memberinfo-1.0.0.jar memberinfo-1.0.0.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/memberinfo-1.0.0.jar"]