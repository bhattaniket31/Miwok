package com.example.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class PhrasesAdapter extends ArrayAdapter<Phrases> {

    public PhrasesAdapter(@NonNull Context context,ArrayList<Phrases> phrasesArrayList) {
        super(context,0,phrasesArrayList);

        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){


        View listItemView=convertView;

       if (listItemView==null){
          listItemView= LayoutInflater.from(getContext()).inflate(R.layout.item_view,parent,false);

       }
            //get the phrases object located in this position.
            Phrases currentObj=getItem(position);

          TextView textView= listItemView.findViewById(R.id.english_text);
            textView.setText(currentObj.getEnglishPhraseName());

            TextView textView2= listItemView.findViewById(R.id.miwok_text);
                    textView2.setText(currentObj.getMiwokPhraseName());
            // listItemView with updated information from the currentPhrasesObject
            return listItemView;
    }
}
