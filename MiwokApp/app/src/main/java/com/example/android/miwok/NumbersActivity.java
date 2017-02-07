package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    /* For Part 1: Learning Arrays
    String array to store numbers one through ten
    protected String[] numberWordsArray = {"one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten"};*/

    //For Part 2: Learning ArrayLists
    //ArrayList to store numbers one through ten
    //ArrayList<String> numberWords;

    //Part 3: Displaying list with LinearLayout
    //LineatLayout variable
    //protected LinearLayout rootView;

    //Part 4: Displaying list with ListView and ArrayAdapter.
    //ListView Variable
    protected ListView rootView;

    //ArrayAdaptet Variable
    //protected ArrayAdapter<Word> stringArrayAdapter;

    //WordAdapter
    protected WordAdapter wordAdapter;

    //ArrayList to store numbers one through ten
    ArrayList<Word> numberWords;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Call the initialize method
        initialize();

        //Part 3: Displaying list with LinearLayout
        //Call the create textviews method
        //createTextViews();

        //Part 4: Displaying list with ListView and ArrayAdapter

    }

    //method to initialize variables
    public void initialize(){

        //Adding numbers to ArrayList numberWords
        //numberWords = new ArrayList<String>();

        //Adding numbers to ArrayList numberWords
        numberWords = new ArrayList<Word>();

        numberWords.add(new Word("one","lutti"));
        numberWords.add(new Word("two","otiko"));
        numberWords.add(new Word("three","tolokokosu"));
        numberWords.add(new Word("four","oyyisa"));
        numberWords.add(new Word("five","massoka"));
        numberWords.add(new Word("six","temmokka"));
        numberWords.add(new Word("seven","kenekaku"));
        numberWords.add(new Word("eight","kawinta"));
        numberWords.add(new Word("nine","wo'e"));
        numberWords.add(new Word("ten","na'aacha"));

        //Part 3: Displaying list with LinearLayout
        //Initializing rootView variable
        //rootView = (LinearLayout) findViewById(R.id.activity_numbers);

        //Part 4: Displaying list with ListView and ArrayAdapter
        //Initializing rootView variable
        rootView = (ListView) findViewById(R.id.list);

        //Initializing Array Adapter
        //stringArrayAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, numberWords);

        //WordAdapter
        wordAdapter = new WordAdapter(this, numberWords);

        //Set ArrayAdapter to ListView
        rootView.setAdapter(wordAdapter);

    }

    /*
    //Part 3: Displaying list with LinearLayout
    //Method to create and display TextViews
    public void createTextViews(){

        //Adding TextViews with Numbers 1 to 10 to LinearLayout rootView using for loop
        for (String words : numberWords){

            //Creating a new TextView
            TextView view = new TextView(this);

            //Setting text to present value of numberWords
            view.setText(words);

            //Adding TextView to rootVuew
            rootView.addView(view);
        }
    }*/

}
