package com.example.spring_flow.features.test.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;


@Controller
//user endpoint : http://localhost:8080/check
@RequestMapping("/check")
public class AliveController {

//user endpoint : http://localhost:8080/alive
    @GetMapping("/alive")
    public String alive() {
        System.out.println(">>>>debug user enpoint: :/check/alive");
        System.out.println(">>>>debug alive controller alive()");
      
        return "alive";
    }
}
