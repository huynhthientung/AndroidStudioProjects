package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtFirstName, txtLastName, txtEmail;
    Button btnRegister;
    EditText edtFirstName, edtLastName, edtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        edtEmail = findViewById(R.id.edtEmail);
        btnRegister = findViewById(R.id.btnRegister);
        txtFirstName = findViewById(R.id.txtFirstName);
        txtLastName = findViewById(R.id.txtLastName);
        txtEmail = findViewById(R.id.txtEmail);

    }


    public void onBtnRegister(View view) {

        txtFirstName.setText("First name: " + edtFirstName.getText().toString());
        txtLastName.setText("Last name: " + edtLastName.getText().toString());
        txtEmail.setText("Email: " + edtEmail.getText().toString());

    }
}