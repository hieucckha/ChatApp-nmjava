package com.nmjava.chatapp.models;

import java.time.LocalDateTime;
import java.util.Date;

public class User {
    private String user_id;
    private String username;
    private String email;
    private String password;
    private String address;
    private Date dob;
    private String name;
    private boolean is_active;
    private boolean is_blocked;
    private LocalDateTime create_at;
    private LocalDateTime update_at;
    private boolean is_admin;
    private String gender;



    public  User()
    {
        user_id="1";
        username="";
        name="";
        email="";
        address="";
        password="1234";
        dob=new Date();
        is_active=true;
        is_admin=false;
        is_blocked=false;
        create_at=LocalDateTime.now();
        update_at=LocalDateTime.now();
        gender="female";

    }
    public String getGender() {
        return gender;
    }

    public void setGender(String sex) {
        this.gender = sex;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public boolean isIs_blocked() {
        return is_blocked;
    }

    public void setIs_blocked(boolean is_blocked) {
        this.is_blocked = is_blocked;
    }

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public void setCreat_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }

    public LocalDateTime getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDateTime update_at) {
        this.update_at = update_at;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }
}
