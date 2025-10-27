package com.example.modul2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);
         // setContentView(R.layout.relative_layout);
        // setContentView(R.layout.activity_main);

//        GridView gridView = (GridView) findViewById(R.id.grid_view);

//        gridView.setAdapter(new ImageAdapter(this));

        setContentView(R.layout.tugasmodul2);
    }
}