package com.beta1.beta1.controller;
import com.beta1.beta1.service.IPrimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/prime")
public class PrimeController {
    IPrimeService primeService;
    public PrimeController(IPrimeService primeService){
        this.primeService=primeService;
    }

    @GetMapping("/{n}")

    public boolean isPrime(@PathVariable int n){
        return primeService.isPrime(n);
    }
}

