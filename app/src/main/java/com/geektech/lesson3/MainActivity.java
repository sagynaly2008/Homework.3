package com.geektech.lesson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.TextView;

import com.example.homework3.Model;
import com.example.homework3.R;
import com.geektech.lesson.itemAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Model> names = new ArrayList<>();
    private itemAdapter adapter;
    private Object TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView = findViewById(R.id.textView);
        LoadData();
        adapter = new itemAdapter(names);
        recyclerView.setAdapter(adapter);
    }

    private void LoadData() {

        names.add(new Model(R.drawable.ic_circle, "Sagynaly \n 0555806961"));
    }
}