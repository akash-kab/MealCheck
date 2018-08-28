package com.example.android.mealcheck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Word> {
    //TODO Change ArrayAdapter to CursorAdapter because we will be using a database.

    public ListAdapter(Context context, List<Word> words) {
        super(context, 0, words);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        Word currentWord = getItem(position);

        TextView checkbox = (TextView) listItemView.findViewById(R.id.checkbox);
        checkbox.setText(currentWord.getMealName());

        return listItemView;
    }
}
