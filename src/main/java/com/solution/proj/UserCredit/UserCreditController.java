package com.solution.proj.UserCredit;

import com.solution.proj.User.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userCredit")
public class UserCreditController {
    private final IUserCreditService userCreditService;
    private final UserService userService;

    public UserCreditController(IUserCreditService userCreditService, UserService userService) {
        this.userCreditService = userCreditService;
        this.userService = userService;
    }

    @GetMapping("/allAccounts")
    public ResponseEntity<?> getAllAccountsInfo(Authentication authentication) throws Exception {
        var user = userService.findUserByUsername(authentication.getName());
        return ResponseEntity.ok(userCreditService.getAllAccounts(user));
    }

    @GetMapping("/accountById")
    public ResponseEntity<?> getAccountById(Authentication auth, String accountId) throws Exception {
        var user = userService.findUserByUsername(auth.getName());
        return ResponseEntity.ok(userCreditService.getAccountById(user, accountId));
    }

}
