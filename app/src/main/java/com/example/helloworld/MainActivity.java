package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSayHi(View view){
        TextView hello = (TextView) findViewById(R.id.hello);
        hello.setText("How are you?");

    }

}
