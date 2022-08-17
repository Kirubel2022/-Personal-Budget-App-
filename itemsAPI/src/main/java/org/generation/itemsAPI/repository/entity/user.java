package org.generation.itemsAPI.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KKMapp_userSignup {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer userSignupid;
    private String userName;
    private String email;
    private String password;
    private String gender;
    private Integer age;

    public KKMapp_userSignup(Integer userSignupid, String userName, String email, String password, String gender, Integer age) {
        this.userSignupid = userSignupid;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }

    public Integer getUserSignupid() {
        return userSignupid;
    }

    public void setUserSignupid(Integer userSignupid) {
        this.userSignupid = userSignupid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "KKMapp_userSignup{" +
                "userSignupid=" + userSignupid +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
