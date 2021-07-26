package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ColorsAdapter extends ArrayAdapter<Colors> {

    public ColorsAdapter(Context context, ArrayList<Colors> colorsArrayList) {
        super(context,0,colorsArrayList);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.item_view,parent,false);
        }

        TextView englishTextView=listItemView.findViewById(R.id.english_text);
        TextView miwokTextView=listItemView.findViewById(R.id.miwok_text);

        Colors currentObj=getItem(position);
        englishTextView.setText(currentObj.getEnglishColor());
        miwokTextView.setText(currentObj.getMiwokColor());
        return listItemView;
    }


}
