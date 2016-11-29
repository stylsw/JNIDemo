package com.fingertip.jnidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    static {        // 加载动态库
        System.loadLibrary("TestJNI");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestJNI  testJNI=new TestJNI();
        Log.e("---------------","************"+testJNI.getHolleWord("恭喜你,调用成功!"));
    }
}
