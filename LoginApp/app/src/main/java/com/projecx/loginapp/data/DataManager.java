package com.projecx.loginapp.data;

import android.graphics.Bitmap;

public class DataManager {
    private static DataManager instance;

    public static DataManager getInstance()
    {
        if(instance==null)
        {
            instance = new DataManager();
        }
        return instance;
    }
    //멤버변수
    private Object data;
    //get set 함수
    public void setData(Object data)
    {
        this.data = data;
    }
    public Object getData(){
        return data;
    }
    //등등 매니저에 맞는 메소드 선언

    public DbLogin getDbLogin()
    {
        DbLogin dbLogin = new DbLogin();
        return dbLogin;
    }
}

//저장할때
//DataManager.getInstance().setData();
//가져올때
//Bitmap data = DataManager.getInstance().getData();
