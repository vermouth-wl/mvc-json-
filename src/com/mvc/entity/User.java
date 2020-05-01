package com.mvc.entity;

/**
 * @Classname User
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-01 16:06
 * @Version 1.0
 **/
public class User {
    private String username;
    private String password;
    private Integer age;
    private String address;

    public User(){}

    public User(String username, String password, Integer age, String address){
        this.username = username;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
