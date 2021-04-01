FROM openjdk:8-jdk-alpine

ENV APP_NAME="plm-pim-adapter-service"
ENV APP_VERSION="0.0.1"

RUN apk add maven
WORKDIR /app/Plm-Pim-Adapter-Service
ADD .git .git
ADD pom.xml pom.xml

EXPOSE 8111