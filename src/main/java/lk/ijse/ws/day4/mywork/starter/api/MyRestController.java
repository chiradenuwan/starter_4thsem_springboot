package lk.ijse.ws.day4.mywork.starter.api;

import lk.ijse.ws.day4.mywork.starter.data.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MyRestController {


    @GetMapping("/api/hello")
    public Message greeting() {
        Message message = new Message();
        message.setSender("Sever");
        message.setMessage("Hello World");
        message.setSendTime(new Date());
        return message;

    }

    @GetMapping("/api/message")
    public Message messageBuilder(
            @RequestParam("username")
                    String user, @RequestParam("message") String msg) {
        Message message = new Message();
        message.setSender(user);
        message.setMessage(msg);
        message.setSendTime(new Date());
        return message;

    }
}