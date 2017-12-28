package com.example.harneet.meminder;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Harneet on 12/28/2017.
 */

@Entity(tableName = "User_Login")
public class User_Login {
    @PrimaryKey
    public final int id;
    public String userName;
    public String password;

    public User_Login(int id, String userName, String password){
        this.id = id;
        this.userName = userName;
        this.password = password;
    }
}