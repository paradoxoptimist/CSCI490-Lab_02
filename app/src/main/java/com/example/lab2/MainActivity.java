package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 1;

    private Button button;
    private Intent i;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.plain_text_input);

        button = findViewById(R.id.button);
        i = new Intent(this, SecondActivity.class);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                i.putExtra("testString", s);

                startActivity(i);

            }
        });
    }
}