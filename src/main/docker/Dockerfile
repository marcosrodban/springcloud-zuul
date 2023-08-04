FROM frolvlad/alpine-oraclejre8:slim
MAINTAINER DrSocram
ADD zuul-0.0.1-SNAPSHOT.jar zuulserver.jar
#EXPOSE 8080
ENTRYPOINT ["java","-jar","/zuulserver.jar","--spring.cloud.bootstrap.location=file:/conf/bootstrap.yml"]
