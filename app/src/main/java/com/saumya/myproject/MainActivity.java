package com.saumya.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameTextView;
    Button button;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = findViewById(R.id.nameTextView);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        nameTextView.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.INVISIBLE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              nameTextView.setVisibility(View.VISIBLE);
              imageView.setVisibility(View.VISIBLE);
            }
        });



    }
}
