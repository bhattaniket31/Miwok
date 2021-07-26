package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyAdapter extends ArrayAdapter<Family> {

    public FamilyAdapter(Context context, ArrayList<Family> arrayList){
        super(context,0,arrayList);

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListView;
        ListView=convertView;

        if (ListView==null){
            ListView=LayoutInflater.from(getContext()).inflate(R.layout.item_view,parent,false);
        }

        Family obj=getItem(position);
        TextView englishTextView=ListView.findViewById(R.id.english_text);
        englishTextView.setText(obj.getEnglishName());

        TextView miwokTextView =ListView.findViewById(R.id.miwok_text);
        miwokTextView.setText(obj.getMiwokName());

        return ListView;
    }
}
