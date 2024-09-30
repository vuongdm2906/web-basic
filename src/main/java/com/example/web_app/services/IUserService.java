package com.example.web_app.services;

import com.example.web_app.dtos.UserDTO;
import com.example.web_app.models.User;

public interface IUserService {
    User createUser(UserDTO userDTO) throws Exception;
    String login(String phoneNumber, String password, Long roleId) throws Exception;
}
