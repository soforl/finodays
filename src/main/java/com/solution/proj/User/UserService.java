package com.solution.proj.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User findUserByUsername(String username) throws Exception {
        User user = userRepository.findByEmail(username);
        if (user == null){
            throw new Exception("User not found");
        }
        return user;
    }
}
