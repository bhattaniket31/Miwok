package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class numbersActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    //set the content of the activity to use the numbers_activity2.xml layout file
        setContentView(R.layout.words_list);

      ArrayList<numbers> arrayList=new ArrayList<numbers>();

        arrayList.add(new numbers("One","Miwok"));
        arrayList.add(new numbers("Two","otiiko"));
        arrayList.add(new numbers("Three","tolookosu"));
        arrayList.add(new numbers("Four","oyyisa"));
        arrayList.add(new numbers("Five",""));
        arrayList.add(new numbers("Six",""));
        arrayList.add(new numbers("Seven",""));
        arrayList.add(new numbers("Eight",""));
        arrayList.add(new numbers("Nine",""));
        arrayList.add(new numbers("",""));



// Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml(Layout for the list item) layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordsAdapter WordsAdapter =new WordsAdapter(this,arrayList);



        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(WordsAdapter);





    }
}


