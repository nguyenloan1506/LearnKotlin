package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private static final String STATE = "trang thai";

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = {"a", "b", "c", "d"};

        listView = (ListView) findViewById(R.id.list_view);
        Adapter adapter = new Adapter(this, items);
        listView.setAdapter(adapter);
    }
}