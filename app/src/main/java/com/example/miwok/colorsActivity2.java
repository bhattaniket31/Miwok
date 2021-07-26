package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class colorsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Colors> colorsArrayList = new ArrayList<Colors>();
        colorsArrayList.add(new Colors("red", "wetetti",R.drawable.ic_launcher_background));
        colorsArrayList.add(new Colors(" green", "chokokki",R.drawable.ic_launcher_background));
        colorsArrayList.add(new Colors("brown", "takaakki",R.drawable.ic_launcher_background));
        colorsArrayList.add(new Colors("gray","topoppi",R.drawable.ic_launcher_background));
        colorsArrayList.add(new Colors("black","kululli",R.drawable.ic_launcher_background));
        colorsArrayList.add(new Colors("white","kelelli",R.drawable.ic_launcher_background));

        ColorsAdapter colorsAdapter=new ColorsAdapter(this,colorsArrayList);

        ListView listView=findViewById(R.id.list);
        listView.setAdapter(colorsAdapter);



    }




}






