package br.com.etecia.deixaelasjogarem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Player> recyclerDataArrayList;

    // Action to add after
    //https://www.geeksforgeeks.org/how-to-add-and-customize-back-button-of-action-bar-in-android/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assigning ID of the toolbar to a variable
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // using toolbar as ActionBar
        setSupportActionBar(toolbar);

        recyclerView=findViewById(R.id.idCourseRV);

        // created new array list..
        recyclerDataArrayList=new ArrayList<>();

        // added data to array list
        recyclerDataArrayList.add(new Player("Alessandra",R.drawable.ic_launcher_background));
        recyclerDataArrayList.add(new Player("Letícia",R.drawable.ic_launcher_background));
        recyclerDataArrayList.add(new Player("Fernanda",R.drawable.ic_launcher_background));
        recyclerDataArrayList.add(new Player("Vanessa",R.drawable.ic_launcher_background));
        recyclerDataArrayList.add(new Player("Ana",R.drawable.ic_launcher_background));

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