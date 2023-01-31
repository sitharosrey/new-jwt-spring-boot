package com.example.jwt_spring_boot_with_mybatis.serviceImp;

import com.example.jwt_spring_boot_with_mybatis.repository.UserRepository;
import com.example.jwt_spring_boot_with_mybatis.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        System.out.println(userRepository.getUserByEmail(email));
        return userRepository.getUserByEmail(email);
    }
}
