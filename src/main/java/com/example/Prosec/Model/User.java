package com.example.Prosec.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {
    private final UUID id_user;
    private final int type_user ;
    private final String email;
    private final String password;

    public User(@JsonProperty("id_user") UUID id_user, @JsonProperty("type_user") int type_user,@JsonProperty("email") String email,@JsonProperty("password") String password) {
        this.id_user = id_user;
        this.type_user = type_user;
        this.email = email;
        this.password = password;
    }

    public int getType_user() {
        return type_user;
    }
    public UUID getId_user(){
        return id_user;
    }
    public String getEmail(){
        return email;
    }

    public String getPassword() {
        return password;
    }
}
