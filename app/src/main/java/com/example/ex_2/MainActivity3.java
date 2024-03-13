package com.example.ex_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.adapter.BeerAdapter;
import com.example.adapter.CustomRecyclerAdapter;
import com.example.ex_2.databinding.ActivityMain2Binding;
import com.example.ex_2.databinding.ActivityMain3Binding;
import com.example.models.Beers;
import com.example.models.BeersRecycler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    ActivityMain3Binding binding;
    CustomRecyclerAdapter adapter;
    ArrayList<BeersRecycler> beers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        customRecycler();
        initData();
        loadData();
    }

    private void customRecycler() {
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        binding.beers.setLayoutManager(layoutManager);
        binding.beers.setHasFixedSize(true);
        // Default divider
        // DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(this, layoutManager.getOrientation());
        //binding.rvBeers.addItemDecoration(dividerItemDecoration);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(binding.beers.getContext(),DividerItemDecoration.HORIZONTAL);
        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(),R.drawable.custom_divider);
        assert drawable !=null;
        dividerItemDecoration.setDrawable(drawable);
        binding.beers.addItemDecoration(dividerItemDecoration);
        binding.beers.setItemAnimator(new DefaultItemAnimator());
    }


    private void initData() {
        beers= new ArrayList<>();
        beers.add(new BeersRecycler(R.drawable.heineken,"Heineken-18000"));
        beers.add(new BeersRecycler(R.drawable.hanoi,"Hà Nội-17000"));
        beers.add(new BeersRecycler(R.drawable.larue,"Larue-16000"));
        beers.add(new BeersRecycler(R.drawable.saigon,"Sài Gòn-15000"));
        beers.add(new BeersRecycler(R.drawable.sapporo,"Sapporo-14000"));
        beers.add(new BeersRecycler(R.drawable.tiger,"Tiger-13000"));
        beers.add(new BeersRecycler(R.drawable.larue,"Larue-16000"));
        beers.add(new BeersRecycler(R.drawable.saigon,"Sài Gòn-15000"));
        beers.add(new BeersRecycler(R.drawable.sapporo,"Sapporo-14000"));
        beers.add(new BeersRecycler(R.drawable.tiger,"Tiger-13000"));
    }
    private void loadData() {
        adapter = new CustomRecyclerAdapter(MainActivity3.this, beers);
        binding.beers.setAdapter(adapter);

    }
}