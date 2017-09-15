package com.harshadachavan.loginintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    Button login;
    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        login = (Button)findViewById(R.id.login_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                user = (EditText)findViewById(R.id.userName_et);
                pass = (EditText)findViewById(R.id.password_et);

                if (user.getText().toString().equals("admin") && pass.getText().toString().equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                    String username = user.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE, username);
                    startActivity(intent);

                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Login Unsuccessful!", Toast.LENGTH_SHORT);
                    toast.show();

                }



            }
        });

    }
}
