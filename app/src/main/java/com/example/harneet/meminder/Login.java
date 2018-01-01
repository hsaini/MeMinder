package com.example.harneet.meminder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class Login extends Activity implements OnClickListener {

    private Button logInButton;
    private Button createAccountButton;

//    EditText username = (EditText) findViewById(R.id.userNameEditLabel);
//    EditText password = (EditText) findViewById(R.id.passwordEditText);

    private User_Login user_login;
    private User_Login_AppDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        database = User_Login_AppDatabase.getDatabase(getApplicationContext());
        database.user_login_dao().removeAllUsers();

        List<User_Login> user_logins = database.user_login_dao().getAllUser();
        if (user_logins.size() == 0) {
            database.user_login_dao().addUser(new User_Login(1, "Hsaini7844", "123456"));
            user_login = database.user_login_dao().getAllUser().get(0);
        }
        
        logInButton = (Button)
                findViewById(R.id.logInButton);
        createAccountButton = (Button)
                findViewById(R.id.createAccountButton);

        logInButton.setOnClickListener(this);
        createAccountButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.logInButton) {
            Intent login = new Intent(Login.this,
                    Home.class);
            startActivity(login);
        } else if (v.getId() == R.id.createAccountButton) {
            Intent create = new Intent(Login.this,
                    Create_Account.class);
            startActivity(create);
        }
    }

//    public void loginValidation() {
//        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
//            //correcct password
//        }
//        else {
//            Toast.makeText(getApplicationContext(),
//                    "Wrong Credentials",Toast.LENGTH_SHORT).show();
//        }
//
//    }
}