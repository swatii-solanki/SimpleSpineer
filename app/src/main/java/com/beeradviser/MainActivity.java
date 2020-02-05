package com.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert beerExpert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
//        get a reference to the text view
        TextView brands = (TextView) findViewById(R.id.brands);
//        get a reference to the spinner
        Spinner color = (Spinner) findViewById(R.id.color);
//        get the selected item in the spinner
        String beerType = String.valueOf(color.getSelectedItem()); // color.getSelectedItem() returns a object

        List<String> brandsList = beerExpert.getBrands(beerType);
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : brandsList) {
            stringBuilder.append(s).append("\n");
        }

        brands.setText(stringBuilder);
    }
}
