package com.example.ex_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.adapter.BeerAdapter;
import com.example.ex_2.databinding.ActivityMain2Binding;
import com.example.models.Beers;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;
    BeerAdapter adapter;
    ArrayList<Beers> beers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initData();
        loadData();
    }


    private void initData() {
        beers= new ArrayList<>();
        beers.add(new Beers(R.drawable.heineken,"Heineken"));
        beers.add(new Beers(R.drawable.hanoi,"Hà Nội"));
        beers.add(new Beers(R.drawable.larue,"Larue"));
        beers.add(new Beers(R.drawable.saigon,"Sài Gòn"));
        beers.add(new Beers(R.drawable.sapporo,"Sapporo"));
        beers.add(new Beers(R.drawable.tiger,"Tiger"));
        beers.add(new Beers(R.drawable.larue,"Larue"));
        beers.add(new Beers(R.drawable.saigon,"Sài Gòn"));
        beers.add(new Beers(R.drawable.sapporo,"Sapporo"));
        beers.add(new Beers(R.drawable.tiger,"Tiger"));
    }
    private void loadData() {
        adapter=new BeerAdapter(MainActivity2.this,R.layout.item_layout,beers);
        binding.beers.setAdapter(adapter);

    }


}