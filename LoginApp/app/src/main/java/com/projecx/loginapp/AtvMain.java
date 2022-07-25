//------------------------------------------------------------------------------------------------//
//
//------------------------------------------------------------------------------------------------//
package com.projecx.loginapp;

//------------------------------------------------------------------------------------------------//
//
//------------------------------------------------------------------------------------------------//
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//------------------------------------------------------------------------------------------------//
//
//------------------------------------------------------------------------------------------------//
public class AtvMain extends AppCompatActivity
{
    EditText etId;
    EditText etPwd;

    Button btnLogin;

    String strId        = "go";
    String strPwd       = "go";
    //--------------------------------------------------------------------------------------------//
    //
    //--------------------------------------------------------------------------------------------//
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atv_main);

        InitLayout();
        InitEvent();
        InitDB();
    }
    //--------------------------------------------------------------------------------------------//
    //
    //--------------------------------------------------------------------------------------------//
    private void InitLayout()
    {
        etId = (EditText) findViewById(R.id.editID);
        etPwd = (EditText)findViewById(R.id.editPassword);
        btnLogin = (Button) findViewById(R.id.loginbutton);
    }
    //--------------------------------------------------------------------------------------------//
    //
    //--------------------------------------------------------------------------------------------//
    private void InitEvent()
    {
//        btnLogin.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//
//            }
//        });

        // lambda 활용.
        btnLogin.setOnClickListener((View v) ->{
            ChackLogin();
        });
    }
    //--------------------------------------------------------------------------------------------//
    //
    //--------------------------------------------------------------------------------------------//
    private void ChackLogin()
    {
        Log.e("dd", etId.getText().toString());
        Log.e("dd", etPwd.getText().toString());

        if( etId.getText().toString().equals(strId) && etPwd.getText().toString().equals(strPwd) )
        {
            Intent intent = new Intent(getApplicationContext(), AtvMenu.class);
//            intent.putExtra("nameText", name); // 시작하는 액티비티에 데이터 넘김.
            startActivity(intent);
        }
    }
    //--------------------------------------------------------------------------------------------//
    //
    //--------------------------------------------------------------------------------------------//
    private void InitDB()
    {
        DBHelper helper;
        SQLiteDatabase db;
        helper = new DBHelper(AtvMain.this, "newdb.db", null, 1);
        db = helper.getWritableDatabase();
        helper.onCreate(db);
    }
}