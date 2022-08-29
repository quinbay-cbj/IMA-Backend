package com.example.UserMicroService.model;

public class StatusResponse {

    private int statusCode;
    private String message;
    private String userId;

    public StatusResponse() {
    }

    public StatusResponse(int statusCode, String message, String userId) {
        this.statusCode = statusCode;
        this.message = message;
        this.userId = userId;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "StatusResponse{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
