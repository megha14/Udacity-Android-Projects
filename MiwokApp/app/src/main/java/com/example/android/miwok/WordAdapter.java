package com.example.android.miwok;

import android.content.Context;
import android.text.NoCopySpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Megha on 2/6/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param mWords A List of Word objects to display in a list
     */
    public WordAdapter(Context context, ArrayList<Word> mWords){
        super(context,0,mWords);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word mWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView englishTranslation = (TextView) listItemView.findViewById(R.id.englishTranslation);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        englishTranslation.setText(mWord.getEnglishTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwokTranslation);
        // Get the version number from the current Word object and
        // set this text on the number TextView
        miwokTranslation.setText(mWord.getMiwokTranslation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        //ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current Word object and
        // set the image to iconView
        //iconView.setImageResource(currentWord.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
