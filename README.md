# Kafka basics

Wiring up a basic Apache Kafka service with 2 Spring Boot projects using Maven and Java 17.

## Set-up

In this project, driver is the producer and user is the consumer. 

This project is using Kafka 3.8.0 with Zookeeper.

Under practice-driver repository is the producer logic and configurations to connect to the Kafka server. 

Under practice-user repository is the consumer logic and configurations to read information from the Kafka server.

The 2 api routes available send string data from practice-driver to one of two topics in the Kafka server.

The /location api route triggers a series of 100 random number stings on a timer to the location topic that will print to the practice-user console.

The /message api route takes in a message that is sent to the user-message topic that will print to the practice-user console.
