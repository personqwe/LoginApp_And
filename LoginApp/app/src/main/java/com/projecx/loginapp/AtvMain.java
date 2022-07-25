//------------------------------------------------------------------------------------------------//
//
//------------------------------------------------------------------------------------------------//
package com.projecx.loginapp;

//------------------------------------------------------------------------------------------------//
//
//------------------------------------------------------------------------------------------------//
import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atv_main);

        InitLayout();
        InitEvent();
        InitDB();
    }
    private void InitDB()
    {
        DBHelper helper;
        SQLiteDatabase db;
        helper = new DBHelper(AtvMain.this, "newdb.db", null, 1);
        db = helper.getWritableDatabase();
        helper.onCreate(db);
    }

    private void InitLayout()
    {
        etId = (EditText) findViewById(R.id.editID);
        btnLogin = (Button) findViewById(R.id.loginbutton);
    }

    private void InitEvent()
    {
        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                etId.getText()
            }
        });
    }
}