package lk.ijse.ws.day4.mywork.starter.api;

import lk.ijse.ws.day4.mywork.starter.data.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

/*
@RestController
@RequestMapping("/api")
public class MyRestController {

    @GetMapping(path = "/hello", produces = "text/plain")
    public ResponseEntity<Message> sayHello() {
        Message message = new Message();
        return new ResponseEntity<Message>(message, HttpStatus.OK);
    }
}*/
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
}