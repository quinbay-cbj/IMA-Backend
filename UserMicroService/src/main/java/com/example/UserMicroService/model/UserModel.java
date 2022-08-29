package com.example.UserMicroService.model;

public class UserModel {

    private String emailId;
    private String userId;
    private String role;
    private String name;
    private boolean status;
    private String address;
    private String contact;

    public UserModel() {
    }

    public UserModel(String emailId, String userId, String role, String name, boolean status, String address, String contact) {
        this.emailId = emailId;
        this.userId = userId;
        this.role = role;
        this.name = name;
        this.status = status;
        this.address = address;
        this.contact = contact;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "emailId='" + emailId + '\'' +
                ", userId='" + userId + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
