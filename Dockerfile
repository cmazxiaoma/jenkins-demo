FROM maven:3.5-jdk-8
MAINTAINER cmazxiaoma
RUN mvn help:system
COPY settings.xml /root/.m2/
RUN "mkdir -p /mvn/usr/local-resource/repository"
CMD echo "This is CMD."