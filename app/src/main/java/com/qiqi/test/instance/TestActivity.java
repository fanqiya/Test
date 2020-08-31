package com.qiqi.test.instance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.qiqi.test.R;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Singleton singleton = Singleton.instance();
    }
}