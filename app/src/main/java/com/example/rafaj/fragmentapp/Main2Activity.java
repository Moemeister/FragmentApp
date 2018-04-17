package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text;
    TextView text1;
    TextView text2;

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = findViewById(R.id.textId);
        text1 = findViewById(R.id.textId1);
        text2 = findViewById(R.id.textId2);

        img = findViewById(R.id.imgGame);

        Intent callingIntent = getIntent();
        String intentAction = callingIntent.getAction();
        String intentType = callingIntent.getType();

        if (Intent.ACTION_SEND.equals(intentAction) && intentType != null){
            if (intentType.equals("text/plain")){
                handleReceivedText(callingIntent);
            }
        }

    }

    private void handleReceivedText(Intent intent){
        Games planet = (Games)intent.getSerializableExtra("game");
        if (text != null && text1 != null && text2 != null ){
            text.setText(planet.getName());
            text1.setText(planet.getYear());
            text2.setText(planet.getType());

        }
        if (img != null) {
            img.setImageResource(planet.getImg());
        }
    }
}
