package me.com.basics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

import java.util.ArrayList;

import me.com.basics.adapters.RecyclerAdapter;
import me.com.basics.model.SampleData;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewRV;
    private ArrayList<SampleData> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewRV = (RecyclerView) findViewById(R.id.recyclerViewRV);
        recyclerViewRV.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewRV.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        populateList();


    }

    private void populateList() {
        for (int i = 0; i < 19; i++) {
            SampleData data = new SampleData();
            data.id.set(android.R.drawable.star_off);
            data.name = "post name " + (i + 1);
            dataList.add(data);
        }
        recyclerViewRV.setAdapter(new RecyclerAdapter(this, dataList));
    }
}
