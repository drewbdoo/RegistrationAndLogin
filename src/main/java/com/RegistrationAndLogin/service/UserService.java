package com.RegistrationAndLogin.service;

import com.RegistrationAndLogin.model.User;
import com.RegistrationAndLogin.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
