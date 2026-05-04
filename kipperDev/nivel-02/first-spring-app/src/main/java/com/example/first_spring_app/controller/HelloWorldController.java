package com.example.first_spring_app.controller;

import com.example.first_spring_app.domain.User;
import com.example.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired // injeta a dependência assim não é mais necessário o construtor abaixo
    private HelloWorldService helloWorldService;

//    public HelloWorldController(HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }

    @GetMapping("") // get  /hello-world
    public String sayHello() {
        return helloWorldService.sayHello("Paulinho");
    }

    @PostMapping("/{id}")
    public String sayHelloPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World " + body.getName()+ " " + id+ " " + filter;
    }
}
