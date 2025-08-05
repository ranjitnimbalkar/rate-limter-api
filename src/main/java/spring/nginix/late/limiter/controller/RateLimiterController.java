package spring.nginix.late.limiter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rate/limiter")
public class RateLimiterController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, World!";
    }
}
