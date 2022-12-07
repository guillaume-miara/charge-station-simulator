FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-alpine-slim

RUN mkdir /app
COPY . /app
WORKDIR /app

RUN ./gradlew build

CMD "./gradlew" "run" "-Parguments=" "ws://{ocpp_endpoint_url} --configuration {'stations':[{'id':'EVB-P17390867','evse':{'count':1,'connectors':1}}]}"
