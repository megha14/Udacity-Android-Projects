package com.example.android.miwok;

/**
 * Created by Megha on 2/6/2017.
 */

//@Word class is a POJO which is used to specify a vocabulary word with its english and miwok translations
public class Word {

    //Declare private variables
    private String mMiwokTranslation;
    private String mEnglishTranslation;

    //Constructor
    public Word(){
        this.mMiwokTranslation = "";
        this.mEnglishTranslation = "";
    }

    //Second Constructor
    public Word(String english, String miwok){
        mMiwokTranslation = miwok;
        mEnglishTranslation = english;
    }

    //Getter method for Miwok Translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //Setter method for English Translation
    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }
}
