package lk.ijse.ws.day4.mywork.starter.api;

import lk.ijse.ws.day4.mywork.starter.data.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @GetMapping(path = "/hello", produces = "text/plain")
    public ResponseEntity<Message> sayHello() {
        Message message = new Message();
        return new ResponseEntity<Message>(message, HttpStatus.OK);
    }
}