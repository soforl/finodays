package com.solution.proj.Credit;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credit")
public class CreditController {
    private final ICreditService service;

    public CreditController(ICreditService service) {
        this.service = service;
    }

    @GetMapping("/allCredits")
    public ResponseEntity<?> getAllCreditProducts() {
        return ResponseEntity.ok(service.getCreditProducts());
    }

    @GetMapping("/getCreditById")
    public ResponseEntity<?> getCreditById(@RequestParam String creditId) throws Exception {
        return ResponseEntity.ok(service.getCreditProductById(creditId));
    }
}
