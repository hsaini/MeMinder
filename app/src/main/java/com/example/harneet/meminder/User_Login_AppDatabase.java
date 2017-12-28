package com.example.harneet.meminder;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by Harneet on 12/28/2017.
 */

@Database(entities = {User_Login.class}, version = 1, exportSchema = false)
public abstract class User_Login_AppDatabase extends RoomDatabase {
    private static  User_Login_AppDatabase INSTANCE;

    public abstract User_Login_Dao user_login_dao();

    public static User_Login_AppDatabase getDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, User_Login_AppDatabase.class, "User Database")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance(){
        INSTANCE = null;
    }
}