FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER cmazxiaoma
VOLUME /tmp
ADD demo-0.0.1-SNAPSHOT.jar demo.jar
RUN sh -c 'touch /demo.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /demo.jar" ]