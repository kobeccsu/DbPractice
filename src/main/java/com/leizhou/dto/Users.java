package com.leizhou.dto;

public class Users {
    int id;
    String uName;
    String password;
    String salt;
    String uid;

    public Users(int id, String uName, String password, String salt, String uid) {
        this.id = id;
        this.uName = uName;
        this.password = password;
        this.salt = salt;
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", uName='" + uName + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}
