package com.solution.proj.agreement.controller;

import com.solution.proj.User.User;
import com.solution.proj.User.UserService;
import com.solution.proj.agreement.entity.Agreement;
import com.solution.proj.agreement.service.AgreementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@Controller
@RequiredArgsConstructor
@RequestMapping("/agreement")
@RestController
@Validated
public class AgreementController {
    private final AgreementService agreementService;
    private final UserService userService;

    @PostMapping(path = "/saveAgreement")
    public ResponseEntity<Agreement> createAgreement(Authentication authentication) throws Exception {
        User user = userService.findUserByUsername(authentication.getName());
        return ResponseEntity.status(HttpStatus.OK).body(agreementService.create(user));
    }


    @GetMapping(path = "/getAgreementById")
    public ResponseEntity<Agreement> getAgreementById(@RequestParam UUID agreementId){
        return ResponseEntity.status(HttpStatus.OK).body(agreementService.getById(agreementId));
    }

    @GetMapping(path = "/getAgreementByUser")
    public ResponseEntity<List<Agreement>> getAgreementByUser(Authentication authentication) throws Exception {
        User user = userService.findUserByUsername(authentication.getName());
        return ResponseEntity.status(HttpStatus.OK).body(agreementService.getByUser(user));
    }
}
