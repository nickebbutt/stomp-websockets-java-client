# stomp-websockets-java-client
A fork of the Spring Boot websocket example project with a working pure java client

https://spring.io/guides/gs/messaging-stomp-websocket/

I couldn't find a working pure java client for the Spring boot stomp websockets demo above - 
I need one for a java-based test harness

This project contains the original spring boot server application (forked) and a separate java client module

Run the server by using the spring-boot:run command on the maven spring-boot plugin 
You can point a web browser at localhost:8080 to say hello from the browser, or run 
the class HelloClient in the client module to do the same thing from the java client
