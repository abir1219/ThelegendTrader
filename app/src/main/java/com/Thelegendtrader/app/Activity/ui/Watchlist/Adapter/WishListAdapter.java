package com.Thelegendtrader.app.Activity.ui.Watchlist.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Thelegendtrader.app.Activity.ui.Watchlist.Model.WatchlistModel;
import com.Thelegendtrader.app.R;

import java.util.List;

public class WishListAdapter extends RecyclerView.Adapter<WishListAdapter.ViewHolder>{
    List<WatchlistModel> modelList;
    Context context;

    public WishListAdapter(List<WatchlistModel> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.stocklist_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvIssuer.setText(modelList.get(position).getIssueer());
        holder.tvPrice.setText(""+modelList.get(position).getPrice());
        holder.tvRate.setText(""+modelList.get(position).getCouponRate());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvIssuer,tvPrice,tvRate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvIssuer = itemView.findViewById(R.id.tbIssuer);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvRate = itemView.findViewById(R.id.tvRate);
        }
    }
}
