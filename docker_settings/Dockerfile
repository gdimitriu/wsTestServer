FROM adoptopenjdk/openjdk13:jdk-13.0.2_8-ubuntu-slim
RUN mkdir /opt/app
COPY wsTestServer-1.0-SNAPSHOT.jar /opt/app/wsTestServer.jar
COPY application.yaml /opt/app
COPY tomcat.https.properties /opt/app
COPY wsServer.jks /root/
WORKDIR /opt/app
EXPOSE 1080
EXPOSE 8081
CMD ["java","-Dtomcat.properties=/opt/app/tomcat.https.properties","-jar", "/opt/app/wsTestServer.jar"]
