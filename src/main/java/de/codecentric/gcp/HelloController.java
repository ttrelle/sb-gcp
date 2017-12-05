package de.codecentric.gcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample Controller.
 * @author tobias.trelle@codecentric.de
 */
@RestController
public class HelloController {

    @Autowired
    private Environment env;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello GCP! MongoDB URI: " + env.getProperty("spring.data.mongodb.uri");
    }

}
