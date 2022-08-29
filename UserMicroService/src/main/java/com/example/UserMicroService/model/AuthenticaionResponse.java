package com.example.UserMicroService.model;

import org.springframework.stereotype.Component;

@Component
public class AuthenticaionResponse {

    private int httpStatusCode;
    private String message;
    private String role;
    private String userId;

    public AuthenticaionResponse() {
    }

    public AuthenticaionResponse(int httpStatusCode, String message, String role, String userId) {
        this.httpStatusCode = httpStatusCode;
        this.message = message;
        this.role = role;
        this.userId = userId;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "AuthenticaionResponse{" +
                "httpStatusCode=" + httpStatusCode +
                ", message='" + message + '\'' +
                ", role='" + role + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
