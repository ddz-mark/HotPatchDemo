package com.markable.hotpatchdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Markable on 2016/10/23.
 */

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Car car;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        car = new Car();
    }

    private void initView() {
        
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, car.fit(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
