package com.RegistrationAndLogin.service;

import com.RegistrationAndLogin.model.Role;
import com.RegistrationAndLogin.model.User;
import com.RegistrationAndLogin.repository.UserRepository;
import com.RegistrationAndLogin.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(),
                registrationDto.getPassword(), Arrays.asList(new Role("ROLE USER")));

        return userRepository.save(user);
    }
}
