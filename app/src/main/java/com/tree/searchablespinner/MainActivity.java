package com.tree.searchablespinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchableSpinner searchableSpinner = (SearchableSpinner) findViewById(R.id.searchable_spinner);
        String[] names = new String[]{"India","CHINA","UK","US","MALYSIA"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,names);
        searchableSpinner.setAdapter(arrayAdapter);

        searchableSpinner.setTitle("Select Item");
        searchableSpinner.setPositiveButton("OK");
    }
}
