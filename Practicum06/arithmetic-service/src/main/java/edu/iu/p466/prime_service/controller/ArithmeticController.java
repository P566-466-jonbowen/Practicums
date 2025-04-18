package edu.iu.p466.prime_service.controller;

import edu.iu.p466.prime_service.service.IArithmeticService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/add")
public class ArithmeticController {

    IArithmeticService arithmeticService;


    public ArithmeticController(IArithmeticService arithmeticService)
    {
        this.arithmeticService = arithmeticService;
    }

    @GetMapping("/{n}/{m}")
    public long add(@PathVariable long n, @PathVariable long m){
        return arithmeticService.add(n, m);
    }


    @GetMapping
    public String greetings() {
        return "Addition time! - (use the form /add/{n}/{m} for n + m!)";

    }

}
