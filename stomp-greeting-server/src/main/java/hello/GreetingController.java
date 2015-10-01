package hello;

import hello.pojo.Greeting;
import hello.pojo.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        System.out.println("Sending Greeting");
        Thread.sleep(3000); // simulated delay
        return new Greeting("Hello, " + message.getName() + "!");
    }

}