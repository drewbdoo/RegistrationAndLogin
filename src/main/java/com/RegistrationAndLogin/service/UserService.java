package com.RegistrationAndLogin.service;

import com.RegistrationAndLogin.model.User;
import com.RegistrationAndLogin.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
