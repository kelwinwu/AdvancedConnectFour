package com.example.kelwinwuju.advancedconnectfour;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView advancedText;
    TextView connectFourText;
    TextView connectFourText2;
    Typeface fontOne;
    Typeface fontTwo;
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

    }
}
