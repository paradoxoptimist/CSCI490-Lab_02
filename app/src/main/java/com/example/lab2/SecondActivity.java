package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private ImageView supermoonImg;
    private ImageView waterfallImg;

    private int imageID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        supermoonImg = findViewById(R.id.supermoon);
        waterfallImg = findViewById(R.id.waterfall);

        supermoonImg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(), "I clicked supermoon", Toast.LENGTH_SHORT).show();
                imageID = R.drawable.supermoon;
                finish();
            }
        });

        waterfallImg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(), "I clicked waterfall", Toast.LENGTH_SHORT).show();
                imageID = R.drawable.waterfall;
                finish();
            }
        });

    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("imageID", imageID);

        setResult(RESULT_OK, intent);
        super.finish();
    }
}
