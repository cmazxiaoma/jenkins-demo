FROM maven:3.5-jdk-8
MAINTAINER cmazxiaoma
WORKDIR /jenkins-demo
RUN mkdir /root/.m2
COPY settings.xml /root/.m2/
RUN mkdir -p /usr/local/mvn-resource/repository
RUN cd /usr/local/mvn-resource/repository
RUN echo $(mvn --version)
#RUN mvn help:system
RUN chmod 777 /usr/local/mvn-resource
RUN chmod 777 /jenkins-demo
