package br.com.etecia.deixaelasjogarem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Player> recyclerDataArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.idCourseRV);

        // created new array list..
        recyclerDataArrayList=new ArrayList<>();

        // added data to array list
        recyclerDataArrayList.add(new Player(R.drawable.ic_launcher_background, "DSA"));
        recyclerDataArrayList.add(new Player(R.drawable.ic_launcher_background, "JAVA"));
        recyclerDataArrayList.add(new Player(R.drawable.ic_launcher_background, "C++"));
        recyclerDataArrayList.add(new Player(R.drawable.ic_launcher_background, "Python"));
        recyclerDataArrayList.add(new Player(R.drawable.ic_launcher_background, "Node Js"));

        // added data from arraylist to adapter class.
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(recyclerDataArrayList,this);

        // setting grid layout manager to implement grid view.
        // in this method '2' represents number of columns to be displayed in grid view.
        GridLayoutManager layoutManager=new GridLayoutManager(this,2);

        // at last set adapter to recycler view.
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}