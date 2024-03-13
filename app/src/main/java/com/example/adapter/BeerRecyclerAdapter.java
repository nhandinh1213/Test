package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ex_2.R;
import com.example.models.Beers;

import java.util.ArrayList;

public class BeerRecyclerAdapter extends RecyclerView.Adapter<BeerRecyclerAdapter.ViewHolder> {
    Context context; //Doi tuong dai dien cho man hinh ung dung
    ArrayList<Beers> beers;//Du lieu

    public BeerRecyclerAdapter(Context context, ArrayList<Beers> beers) {
        this.context = context;
        this.beers = beers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.item_recycler_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imvThumb.setImageResource(beers.get(position).getProductThumb());
        holder.txtName.setText(beers.get(position).getBeerName());

    }

    @Override
    public int getItemCount() {
        return beers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imvThumb;
        TextView txtName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imvThumb=itemView.findViewById(R.id.imvThumb);
            txtName=itemView.findViewById(R.id.txtName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    removeItem(getAdapterPosition());
                }

                private void removeItem(int adapterPosition) {
                    beers.remove(adapterPosition);
                    notifyItemRemoved(adapterPosition);
                }

            });


}

    }
}
