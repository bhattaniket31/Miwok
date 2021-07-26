package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class phrasesActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Phrases> phrasesArrayList=new ArrayList<>();
        phrasesArrayList.add(new Phrases("where are you going","minto wuksus"));
        phrasesArrayList.add(new Phrases("what is yout name ","tinna oyaase'na"));
        phrasesArrayList.add(new Phrases("My name is","oyaaset..."));
        phrasesArrayList.add(new Phrases("How are you","michaksas?"));
        phrasesArrayList.add(new Phrases("where are you going","minto wuksus"));
        phrasesArrayList.add(new Phrases("where are you going","minto wuksus"));
        phrasesArrayList.add(new Phrases("where are you going","minto wuksus"));
        phrasesArrayList.add(new Phrases("where are you going","minto wuksus"));
        phrasesArrayList.add(new Phrases("where are you going","minto wuksus"));
        phrasesArrayList.add(new Phrases("where are you going","minto wuksus"));

       PhrasesAdapter phrasesAdapter=new PhrasesAdapter(this,phrasesArrayList);
        ListView listView=findViewById(R.id.list);
        listView.setAdapter(phrasesAdapter);
    }
}