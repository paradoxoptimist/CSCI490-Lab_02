package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        String s = i.getExtras().getString("testString");

        textView2 = findViewById(R.id.textView2);

        textView2.setText(s);

        finish();
    }

    @Override
    public void finish(){
        Intent intent = new Intent();

        setResult(RESULT_OK, intent);
        super.finish();
    }
}
