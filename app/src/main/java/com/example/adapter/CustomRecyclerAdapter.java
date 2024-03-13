package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ex_2.MainActivity3;
import com.example.ex_2.R;
import com.example.models.Beers;
import com.example.models.BeersRecycler;

import java.util.List;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder> {
    private Context context;
    private List<BeersRecycler> beersList;

    public CustomRecyclerAdapter(Context context, List<BeersRecycler> beersList) {
        this.context = context;
        this.beersList = beersList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View customItemView = layoutInflater.inflate(R.layout.customrecycler_layout, parent, false);
        return new ViewHolder(customItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BeersRecycler beer = beersList.get(position);
        holder.imvProduct.setImageResource(beer.getProductImg());
        holder.txtInfo.setText(beer.getBeerInfo());
    }

    @Override
    public int getItemCount() {
        return beersList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imvProduct;
        TextView txtInfo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imvProduct = itemView.findViewById(R.id.imvProduct);
            txtInfo = itemView.findViewById(R.id.txtInfo);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        BeersRecycler beer = beersList.get(position);
                        removeItem(position);
                        Toast.makeText(context, "Remove " + beer.getBeerInfo(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void removeItem(int position) {
        beersList.remove(position);
        notifyItemRemoved(position);
    }
}