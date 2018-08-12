package com.example.asus.jsonsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.asus.jsonsample.data.QueryUtils;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Data> datas = QueryUtils.getDataFromJson();

        JSONAdapter adapter = new JSONAdapter(this, datas);

        ListView listView = findViewById(R.id.lv_datas);

        listView.setAdapter(adapter);
    }
}
