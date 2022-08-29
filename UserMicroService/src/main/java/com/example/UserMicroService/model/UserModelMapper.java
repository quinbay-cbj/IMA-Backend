package com.example.UserMicroService.model;

import com.example.UserMicroService.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserModelMapper {

    public static UserModelWithProducts parseUserModel(User user,List<Product> productList){

        UserModelWithProducts userModelWithProducts = new UserModelWithProducts();

        userModelWithProducts.setUserId(user.getUserId());
        userModelWithProducts.setName(user.getName());
        userModelWithProducts.setAddress(user.getAddress());
        userModelWithProducts.setContact(user.getContact());
        userModelWithProducts.setEmailId(user.getEmailId());
        userModelWithProducts.setRole(user.getRole());
        userModelWithProducts.setStatus(user.getStatus());
        userModelWithProducts.setProducts(productList);

        return userModelWithProducts;
    }

    public static List<UserModel> parseUserModel(List<User> users){

        List<UserModel> userModels = new ArrayList<>();

        for(User user : users){
            UserModel userModelTemp = new UserModel();
            userModelTemp.setUserId(user.getUserId());
            userModelTemp.setName(user.getName());
            userModelTemp.setAddress(user.getAddress());
            userModelTemp.setContact(user.getContact());
            userModelTemp.setEmailId(user.getEmailId());
            userModelTemp.setRole(user.getRole());
            userModelTemp.setStatus(user.getStatus());
            userModels.add(userModelTemp);
        }
        return userModels;




    }



}
