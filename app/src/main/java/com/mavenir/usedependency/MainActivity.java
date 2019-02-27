package com.mavenir.usedependency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mavenir.mylib.MathAddition;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private MathAddition mathAddition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.text);
        mathAddition = new MathAddition();
        textView.setText(""+mathAddition.addition(10,10));
    }
}
