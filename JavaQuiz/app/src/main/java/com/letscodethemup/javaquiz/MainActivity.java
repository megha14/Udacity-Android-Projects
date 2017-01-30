package com.letscodethemup.javaquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //declare variables from layout
    private EditText a1;
    private EditText a4;
    private TextView totalScore;
    private SeekBar seekBar;
    private TextView bitValue;

    //variable to store total score
    private int score=0;

    //variable to store score of answer 2
    private int scoreAnswer2=0;

    //variable to store score of answer 3
    private boolean scoreAnswer3;

    //variable to store score of answer 2
    private int scoreAnswer5=0;

    //variable to store score of answer 6
    private boolean scoreAnswer6;

    //variable to store score of answer 8
    private boolean scoreAnswer8;

    //variable to store score of answer 9
    private int scoreAnswer9=0;

    //variable to store score of answer 10
    private boolean scoreAnswer10;

    //variable to stare pogress of seekbar
    private int progress = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize variables
        initializeVariables();

        //seekbar listener
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
               }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                bitValue.setText("Answer: " + progress);
            }
        });
    }

    //initializing variables
    public void initializeVariables(){
        a1 = (EditText) findViewById(R.id.a1);
        a4 = (EditText) findViewById(R.id.a4);
        totalScore = (TextView)findViewById(R.id.score);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        bitValue = (TextView)findViewById(R.id.bitValue);
    }

    public void increaseScore(){
        score += 1;
        Log.v("Just Java",String.valueOf(score));
    }

    //method for checkboxes
    public void onCheckboxClicked(View view){

        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case (R.id.a2) :
                if (checked)
                    scoreAnswer2 += 1;
                else
                    scoreAnswer2 -= 1;
                break;
            case R.id.b2:
                if (checked)
                    scoreAnswer2 += 1;
                else
                    scoreAnswer2 -= 1;
                break;
            case R.id.c2:
                if (checked)
                    scoreAnswer2 += 1;
                else
                    scoreAnswer2 -= 1;
                break;
            case R.id.d2:
                if (checked)
                    scoreAnswer2 -= 1;
                else
                    scoreAnswer2 += 1;
                break;
            case (R.id.a5):
                Log.v("Just Java", "Checkbox clicked");
                if (checked)
                    scoreAnswer5 += 1;
                else
                    scoreAnswer5 -= 1;
                break;
            case R.id.b5:
                if (checked)
                    scoreAnswer5 += 1;
                else
                    scoreAnswer5 -= 1;
                break;
            case R.id.c5:
                if (checked)
                    scoreAnswer5 -= 1;
                else
                    scoreAnswer5 += 1;
                break;
            case R.id.d5:
                if (checked)
                    scoreAnswer5 -= 1;
                else
                    scoreAnswer5 += 1;
                break;
            case (R.id.a9):
                Log.v("Just Java", "Checkbox clicked");
                if (checked)
                    scoreAnswer9 += 1;
                else
                    scoreAnswer9 -= 1;
                break;
            case R.id.b9:
                if (checked)
                    scoreAnswer9 += 1;
                else
                    scoreAnswer9 -= 1;
                break;
            case R.id.c9:
                if (checked)
                    scoreAnswer9 -= 1;
                else
                    scoreAnswer9 += 1;
                break;
            case R.id.d9:
                if (checked)
                    scoreAnswer9 += 1;
                else
                    scoreAnswer9 -= 1;
                break;

        }
    }


    //method for radio buttons
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case (R.id.a3) :
                if (checked)
                    scoreAnswer3 = false;
                else
                    scoreAnswer3 = false;
                break;
            case R.id.b3:
                if (checked)
                    scoreAnswer3 = true;
                else
                    scoreAnswer3 = false;
                break;
            case R.id.c3:
                if (checked)
                    scoreAnswer3 = false;
                else
                    scoreAnswer3 = false;
                break;
            case R.id.d3:
                if (checked)
                    scoreAnswer3 = false;
                else
                    scoreAnswer3 = false;
                break;
            case (R.id.a6) :
                if (checked)
                    scoreAnswer6 = true;
                else
                    scoreAnswer6 = false;
                break;
            case R.id.b6:
                if (checked)
                    scoreAnswer6 = false;
                else
                    scoreAnswer6 = false;
                break;
            case (R.id.a8) :
                if (checked)
                    scoreAnswer8 = false;
                else
                    scoreAnswer8 = false;
                break;
            case R.id.b8:
                if (checked)
                    scoreAnswer8 = false;
                else
                    scoreAnswer8 = false;
                break;
            case R.id.c8:
                if (checked)
                    scoreAnswer8 = true;
                else
                    scoreAnswer8 = false;
                break;
            case R.id.d8:
                if (checked)
                    scoreAnswer8 = false;
                else
                    scoreAnswer8 = false;
                break;
            case (R.id.a10) :
                if (checked)
                    scoreAnswer10 = false;
                else
                    scoreAnswer10 = false;
                break;
            case R.id.b10:
                if (checked)
                    scoreAnswer10 = false;
                else
                    scoreAnswer10 = false;
                break;
            case R.id.c10:
                if (checked)
                    scoreAnswer10 = false;
                else
                    scoreAnswer10 = false;
                break;
            case R.id.d10:
                if (checked)
                    scoreAnswer10 = true;
                else
                    scoreAnswer10 = false;
                break;
        }
    }

    //method to check answer 1
    public void checkAnswer1(String a1){
        if(a1.equalsIgnoreCase("false")){
            Log.v("Just Java","Answer 1 correct");
            increaseScore();
        }
    }

    //method to check answer 2
    public void checkAnswer2(){
        if(scoreAnswer2==3){
            Log.v("Just Java","Answer 2 correct");
            increaseScore();
        }

    }

    //method to check answer 3
    public void checkAnswer3(){
        if(scoreAnswer3) {
            Log.v("Just Java","Answer 3 correct");
            increaseScore();
        }
    }

    //method to check answer 4
    public void checkAnswer4(String a4){
        if(a4.equalsIgnoreCase("false")){
            Log.v("Just Java","Answer 4 correct");
            increaseScore();
        }
    }

    //method to check answer 5
    public void checkAnswer5(){
        if(scoreAnswer5==2){
            Log.v("Just Java","Answer 5 correct");
            increaseScore();
        }
    }

    //method to check answer 6
    public void checkAnswer6(){
        if(scoreAnswer6) {
            Log.v("Just Java","Answer 6 correct");
            increaseScore();
        }
    }

    //method to check answer 7
    public void checkAnswer7(){
        if(progress==32){
            Log.v("Just Java","Answer 8 correct");
            increaseScore();
        }
    }

    //method to check answer 8
    public void checkAnswer8(){
        if(scoreAnswer8) {
            Log.v("Just Java","Answer 8 correct");
            increaseScore();
        }
    }

    //method to check answer 9
    public void checkAnswer9(){
        if(scoreAnswer9==3){
            Log.v("Just Java","Answer 9 correct");
            increaseScore();
        }
    }

    //method to check answer 10
    public void checkAnswer10(){
        if(scoreAnswer10) {
            Log.v("Just Java","Answer 10 correct");
            increaseScore();
        }
    }

    public void submit(View view){

        //Check Answer
        checkAnswer1(a1.getText().toString());
        checkAnswer2();
        checkAnswer3();
        checkAnswer4(a4.getText().toString());
        checkAnswer5();
        checkAnswer6();
        checkAnswer7();
        checkAnswer8();
        checkAnswer9();
        checkAnswer10();

        //string to store score message
        String message = "Score : "+score;

        //show toast message
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

        //set score
        totalScore.setText(message);

    }
}
