package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class familyActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Family> familyArrayList=new ArrayList<Family>();
        familyArrayList.add(new Family("father","apa"));
        familyArrayList.add(new Family("mother","ata"));
        familyArrayList.add(new Family("son","angsi"));
        familyArrayList.add(new Family("daughter","tune"));
        familyArrayList.add(new Family("older brother","taachi"));
        familyArrayList.add(new Family("older sister","tete"));



        FamilyAdapter familyAdapter=new FamilyAdapter(this,familyArrayList);
        ListView listView=findViewById(R.id.list);
        listView.setAdapter(familyAdapter);
    }
}