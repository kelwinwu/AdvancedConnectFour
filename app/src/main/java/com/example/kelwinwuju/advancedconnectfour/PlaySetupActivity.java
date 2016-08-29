package com.example.kelwinwuju.advancedconnectfour;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.widget.Switch;
import android.widget.TextView;

public class PlaySetupActivity extends Activity {



    TextView gameRulesTitle;
    TextView playersText;
    TextView rowsText;
    TextView columnsText;
    TextView winConditionText;
    Switch randomBoardText;
    Switch variableText;


    Typeface fontOne;
    //Typeface fontTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_two_player_setup);

        gameRulesTitle = (TextView)findViewById(R.id.gameSetupText);
        fontOne = Typeface.createFromAsset(getAssets(), "fonts/foo.ttf");
        gameRulesTitle.setTypeface(fontOne);

        playersText = (TextView)findViewById(R.id.playersText);
        playersText.setTypeface(fontOne);

        rowsText = (TextView)findViewById(R.id.rowsText);
        rowsText.setTypeface(fontOne);

        columnsText = (TextView)findViewById(R.id.columnsText);
        columnsText.setTypeface(fontOne);

        winConditionText = (TextView)findViewById(R.id.winConditionText);
        winConditionText.setTypeface(fontOne);

    }
}
