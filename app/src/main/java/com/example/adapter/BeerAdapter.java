package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ex_2.R;
import com.example.models.Beers;

import java.util.List;

public class BeerAdapter extends BaseAdapter {
    private Context context;
    private int itemLayout;
    private List<Beers> beerList;

    public BeerAdapter(Context context, int itemLayout, List<Beers> beerList) {
        this.context = context;
        this.itemLayout = itemLayout;
        this.beerList = beerList;
    }

    @Override
    public int getCount() {
        return beerList.size();
    }

    @Override
    public Object getItem(int position) {
        return beerList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(itemLayout, parent, false);
            holder.imvProduct = convertView.findViewById(R.id.imvProduct);
            holder.txtName = convertView.findViewById(R.id.txtName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Beers beer = beerList.get(position);
        holder.imvProduct.setImageResource(beer.getProductThumb());
        holder.txtName.setText(beer.getBeerName());
        return convertView;
    }

    private static class ViewHolder {
        ImageView imvProduct;
        TextView txtName;
    }
}