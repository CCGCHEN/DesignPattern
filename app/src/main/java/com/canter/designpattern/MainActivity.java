package com.canter.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.canter.designpattern.strategy.StrategyDemo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.strategy).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.strategy:
                StrategyDemo.runStrategy("+");
                StrategyDemo.runFactotyStrategy("1");
                break;
            default:
                break;
        }
    }
}
