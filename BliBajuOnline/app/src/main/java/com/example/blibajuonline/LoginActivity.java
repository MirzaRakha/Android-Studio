package com.example.blibajuonline;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText InputName, InputPhoneNumber, InputPassword;
    private Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = (Button) findViewById(R.id.login_btn);
        InputPassword = (EditText) findViewById(R.id.register_username_input);
        InputPassword = (EditText)  findViewById(R.id.register_password_input);
        InputPhoneNumber = (EditText) findViewById(R.id.register_number_input);
        loadingBar = new ProgressDialog(this);
    }
}
