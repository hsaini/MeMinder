package com.example.harneet.meminder;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Harneet on 12/28/2017.
 */

@Dao
public interface User_Login_Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addUser(User_Login user_login);

    @Query("select * from user_login")
    public List<User_Login> getAllUser();

    @Query("select * from user_login where id = userName")
    public List<User_Login> getUser();

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateUser(User_Login user_login);

    @Query("delete from user_login")
    void removeAllUsers();
}
