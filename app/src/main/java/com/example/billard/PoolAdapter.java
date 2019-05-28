package com.example.billard;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

public class PoolAdapter extends RecyclerView.Adapter<PoolAdapter.PoolViewHolder>  {

    private ArrayList<Pool> pools;
    private Resources res;

    public PoolAdapter(Context context, ArrayList<Pool> pools){
        this.pools = pools;
        this.res = context.getResources();
    }

    @Override
    public PoolViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pool, parent, false);
        return new PoolViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PoolViewHolder holder, int position ){
        final Pool pool = pools.get(position);
        holder.lblNum.setText(pool.getNum());
        holder.lblStatus.setText(String.valueOf(pool.isStatus()));
    }

    @Override
    public int getItemCount(){
        return pools.size();
    }

    public static class PoolViewHolder extends RecyclerView.ViewHolder{
        private TextView lblNum ;
        private TextView lblStatus;

        public PoolViewHolder(View item){
            super(item);
            lblNum = (TextView)item.findViewById(R.id.lblNum);
            lblStatus = (TextView)item.findViewById(R.id.lblStatus);
        }
    }

}
