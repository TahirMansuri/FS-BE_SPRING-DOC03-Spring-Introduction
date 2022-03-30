package com.infogalaxy.myspringproject.controller;

import com.infogalaxy.myspringproject.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    //$ curl localhost:8080/hello -w "\n"
    @RequestMapping(value={"","/","/home"})
    public String sayHello() {
        return "Hello from InfoGalaxy Rest Controller";
    }

    //$ curl localhost:8080/hello/query?name=Tahir
    @RequestMapping(value={"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value="name") String name) {
        return "Hello, "+ name +" !";
    }

    //$ curl localhost:8080/hello/param/name=Tahir
    @GetMapping(value="/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello, "+name+" !";
    }

    //$ curl -X POST -H "Content-Type: application/json" -d '{"firstname" : "Tahir","lastname" : "Mansuri"}' "http://localhost:8080/hello/post"
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello, "+ user.getFirstname() + " " + user.getLastname() +" !";
    }

    //$ curl -X PUT localhost:8080/hello/put/Tahir/?lastname=Mansuri
    @PutMapping("/put/{firstname}")
    public String sayHello(@PathVariable String firstname, @RequestParam(value="lastname") String lastname) {
        return "Hello, "+ firstname +" "+ lastname +" !";
    }
}
