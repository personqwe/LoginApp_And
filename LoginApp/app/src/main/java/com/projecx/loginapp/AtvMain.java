package com.projecx.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AtvMain extends AppCompatActivity {

    EditText etId;
    EditText etPwd;
    String pwd;
    String chk_Pwd = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atv_main);

        InitLayout();
        InitEvent();
    }
    private void InitLayout()
    {
        etId = (EditText)findViewById(R.id.editID);
        etPwd = (EditText)findViewById(R.id.ediPassword);


    }

    private void InitEvent()
    {
        Button login = (Button) findViewById(R.id.loginbutton);
        login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                    if(etPwd.getText().toString().equals(chk_Pwd))
                    {
                        Intent intent = new Intent(getApplicationContext(), AtvNextPage.class);
                        startActivity(intent);
                    }
            }
        });
    }


}