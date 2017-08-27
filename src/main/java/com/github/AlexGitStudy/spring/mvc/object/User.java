package com.github.AlexGitStudy.spring.mvc.object;

import javax.validation.constraints.Size;

public class User {
    @Size(min=6,message = "минмтально 6 знаков")
    private String name;
    @Size(min=3, max =10,  message = "минмтально 6 знаков")
    private String password;
    private boolean role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
}
