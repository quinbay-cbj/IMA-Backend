package com.example.UserMicroService.service;

import com.example.UserMicroService.model.AuthenticaionResponse;

public interface AuthService {

    AuthenticaionResponse login(String emailId, String password);

}
