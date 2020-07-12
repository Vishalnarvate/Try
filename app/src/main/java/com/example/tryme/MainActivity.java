package com.example.tryme;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;;import java.util.Random;


public class MainActivity extends AppCompatActivity {
 private View windowView;
 private Button button2;
 private int[] colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors=new int[]{Color.RED, Color.CYAN, Color.GREEN, Color.BLUE, Color.YELLOW};

        windowView=findViewById(R.id.windowId);
        button2=(Button)findViewById(R.id.button2);
         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Random random = new Random();
                 int randNum = random.nextInt(5);
                 windowView.setBackgroundColor(colors[randNum]);
                 // Log.d("fff", "sss");
             }
         });

    }
}