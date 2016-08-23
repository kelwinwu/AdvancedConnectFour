package com.example.kelwinwuju.advancedconnectfour;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    TextView advancedText;
    TextView connectFourText;
    TextView connectFourText2;
    Typeface fontOne;
    Typeface fontTwo;

    //public Button playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        advancedText = (TextView)findViewById(R.id.advancedtext);
        fontOne = Typeface.createFromAsset(getAssets(), "fonts/blow.ttf");
        advancedText.setTypeface(fontOne);

        connectFourText = (TextView)findViewById(R.id.connectfourtext);
        fontTwo = Typeface.createFromAsset(getAssets(), "fonts/foo.ttf");
        connectFourText.setTypeface(fontTwo);

        connectFourText2 = (TextView)findViewById(R.id.connectfourtext2);
        connectFourText2.setTypeface(fontTwo);


        ImageButton playButton = (ImageButton)findViewById(R.id.playButton);
        playButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.playButton:
                //Do your stuff here
                Intent playIntent = new Intent(MainActivity.this, PlaySetupActivity.class);
                startActivity(playIntent);
                break;
        }
    }
}
