package com.example.harneet.meminder;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Harneet on 12/28/2017.
 */

@Entity(tableName = "User_Create_Account")
public class User_C_Account {
    @PrimaryKey
    public final int id;
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public String re_enter_password;


    public User_C_Account(int id, String firstName, String lastName, String email,
                               String password, String re_enter_password){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.re_enter_password = re_enter_password;
    }
}
