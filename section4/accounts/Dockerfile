#Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

# We used this before "MAINTAINER" instruction is deprecated in favor of using "label"
# MAINTAINER eazybytes.com
#Information around who maintains the image
LABEL "pauravLearningMicroservice"="pauravsingh.com"

#Copy same jar from inside my target folder to Docker image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar


# execution of our application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]

