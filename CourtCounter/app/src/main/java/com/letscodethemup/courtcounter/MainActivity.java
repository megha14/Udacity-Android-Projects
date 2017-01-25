package com.letscodethemup.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int aScore = 0;
    int bScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(aScore);
        displayForTeamB(bScore);
    }

    public void displayForTeamA(int score){
        TextView scoreA = (TextView)findViewById(R.id.scoreA);
        scoreA.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreB = (TextView)findViewById(R.id.scoreB);
        scoreB.setText(String.valueOf(score));
    }

    public void addScore3ForA(View view){
        aScore += 3;
        displayForTeamA(aScore);
    }

    public void addScore2ForA(View view){
        aScore += 2;
        displayForTeamA(aScore);
    }

    public void freeThrowForA(View view){
        aScore += 1;
        displayForTeamA(aScore);
    }

    public void addScore3ForB(View view){
        bScore += 3;
        displayForTeamB(bScore);
    }

    public void addScore2ForB(View view){
        bScore += 2;
        displayForTeamB(bScore);
    }

    public void freeThrowForB(View view){
        bScore += 1;
        displayForTeamB(bScore);
    }

    public void reset(View view){
        aScore=0;
        bScore=0;
        displayForTeamA(aScore);
        displayForTeamB(bScore);
    }

}
