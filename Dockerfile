FROM openjdk:11-jre-slim
RUN apt-get update && apt-get -y upgrade
WORKDIR /home/tom/

COPY . .
CMD ["java", "-jar", "app.jar"]
