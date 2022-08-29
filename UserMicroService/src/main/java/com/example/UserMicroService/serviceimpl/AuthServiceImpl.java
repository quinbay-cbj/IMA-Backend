package com.example.UserMicroService.serviceimpl;

import com.example.UserMicroService.entity.User;
import com.example.UserMicroService.helper.Constants;
import com.example.UserMicroService.model.AuthenticaionResponse;
import com.example.UserMicroService.repository.AuthRepo;
import com.example.UserMicroService.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthServiceImpl implements AuthService {


    @Autowired
    AuthenticaionResponse authenticaionResponse;

    @Autowired
    AuthRepo authRepo;



    @Override
    public AuthenticaionResponse login(String emailId,String password){

        User user = authRepo.findByEmailId(emailId);

        if(user == null){
            authenticaionResponse.setHttpStatusCode(Constants.NOT_FOUND_CODE);
            authenticaionResponse.setMessage(Constants.NO_ACCOUNT_FOUND_MSG);
            authenticaionResponse.setRole(null);
            authenticaionResponse.setUserId(null);
        }
        else{
            if(user.getPassword().equals(password)){
                authenticaionResponse.setHttpStatusCode(Constants.SUCCESS_CODE);
                authenticaionResponse.setMessage(Constants.SUCCESS_MSG);
                authenticaionResponse.setRole(user.getRole());
                authenticaionResponse.setUserId(user.getUserId());
            }
            else{
                authenticaionResponse.setHttpStatusCode(Constants.NOT_FOUND_CODE);
                authenticaionResponse.setMessage(Constants.NOT_FOUND_MSG);
                authenticaionResponse.setRole(null);
                authenticaionResponse.setUserId(null);
            }
        }
        return authenticaionResponse;
    }


}
