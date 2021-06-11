package com.uktechians.androidbutterknife.demo;

public class ModelUser {

    String name;
    String phone;

    public ModelUser() {
    }

    public ModelUser(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
