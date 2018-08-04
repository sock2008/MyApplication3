package com.example.yura.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginButton(View view) {
        EditText loginEt = findViewById(R.id.login);
        String login = loginEt.getText().toString();
        EditText passEt = findViewById(R.id.pass);
        String pass = passEt.getText().toString();
        if((login.equals("admin.foto")) && (pass.equals("magdj530"))){
            logMess(login + pass);

// Запускается AnaliticActivity
            Intent intent = new Intent(MainActivity.this, AnaliticActivity.class);
            startActivity(intent);}

            else {
            logMess("Отказано в доступе");
        }

    }

    public void logMess(String message) {
        TextView logResult = findViewById(R.id.login_result);
        logResult.setText(message);
    }


}
