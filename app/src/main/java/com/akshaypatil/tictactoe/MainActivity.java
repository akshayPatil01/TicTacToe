package com.akshaypatil.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button[][] buttons = new Button[3][3];
    private boolean player1Turn = true;
    private int totalTurns;

    Button btnreset;
    TextView tvheading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnreset = findViewById(R.id.btnreset);
        tvheading = findViewById(R.id.tvheading);

        Typeface type = Typeface.createFromAsset(getAssets(),"Fonts/MMBold.ttf");
        Typeface type1 = Typeface.createFromAsset(getAssets(),"Fonts/MMLight.ttf");
        tvheading.setTypeface(type);
        btnreset.setTypeface(type1);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                String buttonID = "btn_" + i + j;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttons[i][j] = findViewById(resID);
            }
        }



    }
}
