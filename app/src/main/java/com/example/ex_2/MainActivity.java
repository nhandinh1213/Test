package com.example.ex_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.ex_2.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();

    }

    private void loadData() {
        ArrayList<String> dsSP=new ArrayList<>();
        dsSP.add("Máy ảnh"); dsSP.add("Laptop"); dsSP.add("Điện thoại");
        dsSP.add("Sạc dự phòng"); dsSP.add("Ổ cứng di động");
        GridView gvProduct = binding.gvProduct;
        gvProduct = findViewById(R.id.gvProduct);
        arrayAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1);
        arrayAdapter.addAll(dsSP);
        gvProduct.setAdapter(arrayAdapter);
    }
}

