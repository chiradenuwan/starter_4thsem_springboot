package lk.ijse.ws.day4.mywork.starter.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MyRestController {

    @GetMapping(path = "/hello", produces = "text/plain")
    public ResponseEntity<Object> sayHello() {
        return new ResponseEntity<Object>("Hello World", HttpStatus.OK);
    }
}