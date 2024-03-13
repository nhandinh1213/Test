package com.example.ex_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.adapter.BeerRecyclerAdapter;
import com.example.adapter.CustomRecyclerAdapter;
import com.example.ex_2.databinding.ActivityMain3Binding;
import com.example.ex_2.databinding.ActivityMain4Binding;
import com.example.models.Beers;
import com.example.models.BeersRecycler;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    ActivityMain4Binding binding;
    BeerRecyclerAdapter adapter;
    ArrayList<Beers> beers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initData();
        customAndLoadData();
    }

    private void initData() {
        beers= new ArrayList<>();
        beers.add(new Beers(R.drawable.heineken,"Heineken-18000"));
        beers.add(new Beers(R.drawable.hanoi,"Hà Nội-17000"));
        beers.add(new Beers(R.drawable.larue,"Larue-16000"));
        beers.add(new Beers(R.drawable.saigon,"Sài Gòn-15000"));
        beers.add(new Beers(R.drawable.sapporo,"Sapporo-14000"));
        beers.add(new Beers(R.drawable.tiger,"Tiger-13000"));
        beers.add(new Beers(R.drawable.larue,"Larue-16000"));
        beers.add(new Beers(R.drawable.saigon,"Sài Gòn-15000"));
        beers.add(new Beers(R.drawable.sapporo,"Sapporo-14000"));
        beers.add(new Beers(R.drawable.tiger,"Tiger-13000"));
        adapter = new BeerRecyclerAdapter(getApplicationContext(),beers);
        binding.rvBeers.setAdapter(adapter);
    }

    private void customAndLoadData() {
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        binding.rvBeers.setLayoutManager(layoutManager);
        binding.rvBeers.setHasFixedSize(true);
        // Default divider
       // DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(this, layoutManager.getOrientation());
        //binding.rvBeers.addItemDecoration(dividerItemDecoration);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(binding.rvBeers.getContext(),DividerItemDecoration.HORIZONTAL);
        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(),R.drawable.custom_divider);
        assert drawable !=null;
        dividerItemDecoration.setDrawable(drawable);
        binding.rvBeers.addItemDecoration(dividerItemDecoration);
        binding.rvBeers.setItemAnimator(new DefaultItemAnimator());
    }

}