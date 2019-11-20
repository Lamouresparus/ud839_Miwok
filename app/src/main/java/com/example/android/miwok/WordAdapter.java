package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private  int mResourceColor;


    public WordAdapter(Context context, List<Word> words, int resourceColor) {
        super(context, 0, words);

        mResourceColor = resourceColor;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        Word currentWord = getItem(position);

        TextView miwokWordTextView = listItemView.findViewById(R.id.miwokTextView);
        miwokWordTextView.setText(currentWord.getmMiwokWord());

        TextView englishWordTextView = listItemView.findViewById(R.id.englishTextView);
        englishWordTextView.setText(currentWord.getmEnglishWord());

        ImageView imageResourceView = listItemView.findViewById(R.id.miwok_image_view);

        if (currentWord.hasImage()) {
            imageResourceView.setImageResource(currentWord.getmImageResource());
            imageResourceView.setVisibility(View.VISIBLE);
        }
        else{
            imageResourceView.setVisibility(View.GONE);
        }

        View textViews = listItemView.findViewById(R.id.textviews);
        int color = ContextCompat.getColor(getContext(), mResourceColor);
        textViews.setBackgroundColor(color);

        return listItemView;
    }
}
