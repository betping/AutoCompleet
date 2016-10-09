package com.acadgild.autocompleet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView autoCompleteTextView;
String[] Product_Names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView= (AutoCompleteTextView) findViewById(R.id.products);
       Product_Names= getResources().getStringArray(R.array.Product_Names);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Product_Names);
        autoCompleteTextView.setAdapter(adapter);
    }
}
