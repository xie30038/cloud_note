package control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
@RequestMapping("/user")
public class HelloWorldController {

    @RequestMapping("/login")
    public String HelloWorld(){
        return "hello";
    }
}
