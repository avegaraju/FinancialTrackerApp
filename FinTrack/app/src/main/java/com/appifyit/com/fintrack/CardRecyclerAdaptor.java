package com.appifyit.com.fintrack;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ashishv on 1/2/2016.
 */
public class CardRecyclerAdaptor extends RecyclerView.Adapter<CardRecyclerAdaptor.DataObjectHolder> {

    private static final String TAG = "CardRecyclerAdapter";
    private ArrayList<DataObject> mDataSet;
    private static final String LOG_TAG = "CardRecyclerAdaptor";
    public static class DataObjectHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView finance_desc;
        public DataObjectHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.text_name);
            finance_desc = (TextView) itemView.findViewById(R.id.text_finance_desc);
            Log.i(LOG_TAG, "Adding Listener");

        }

       /* @Override
        public void onClick(View v) {
            myClickListener.onItemClick(getAdapterPosition(), v);
        }*/
    }

    public CardRecyclerAdaptor(ArrayList<DataObject> argDataSet){
        mDataSet = argDataSet;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_row, parent, false);


        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, final int position) {
        holder.finance_desc.setText(mDataSet.get(position).getFinanceDescription());
        holder.name.setText(mDataSet.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v(TAG, "Card Item Clicked at position :" + position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

}


