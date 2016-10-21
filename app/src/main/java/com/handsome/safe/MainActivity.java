package com.handsome.safe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static{
        //加载动态库，名字和c文件名相同
        System.loadLibrary("hello");
    }

    public native String helloWord();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //按钮点击调用方法
    public void open(View view){
        Toast.makeText(this,helloWord(),Toast.LENGTH_LONG).show();
    }

}
