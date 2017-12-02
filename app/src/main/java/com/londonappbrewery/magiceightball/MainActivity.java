package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView image_8ball = (ImageView) findViewById(R.id.image_8ball);

        Button myButton = (Button) findViewById(R.id.askbutton);

        final int[] ballarray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random RNG = new Random();
                int number = RNG.nextInt(4);//using RNG here
                int imageResourceId = ballarray[number];
                image_8ball.setImageResource(imageResourceId);

            }
        });

    }
}
