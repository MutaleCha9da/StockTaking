package com.ads.agropay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class StocktakingActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{

    private EditText mSold, mExpired, mDamaged, mLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocktaking);

        Spinner spinner = (Spinner) findViewById(R.id.products);
        spinner.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Product 1");
        categories.add("Product 2");
        categories.add("Product 3");
        categories.add("Product 4");
        categories.add("Product 5");
        categories.add("Product 6");
        categories.add("Product 7");
        categories.add("Product 8");
        categories.add("Product 9");
        categories.add("Product 10");
        categories.add("Product 11");
        categories.add("Product 12");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        mSold = (EditText) findViewById(R.id.sold);
        mExpired = (EditText) findViewById(R.id.expired);
        mDamaged = (EditText) findViewById(R.id.damaged);
        mLeft = (EditText) findViewById(R.id.left);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
