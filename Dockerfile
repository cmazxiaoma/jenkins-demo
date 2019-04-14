FROM maven:3.5-jdk-8
MAINTAINER cmazxiaoma
RUN mvn help:system
RUN su root
RUN chown -R 1000 /root/.m2
CMD echo "This is CMD."