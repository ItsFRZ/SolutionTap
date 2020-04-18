package com.pandorax.solutiontap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AllDataAdapter extends RecyclerView.Adapter<AllDataAdapter.AlldataItemViewHolder>{

    private ArrayList<AllDataItems> arrayList;
    private Context context;

    public AllDataAdapter(ArrayList<AllDataItems> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public AlldataItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.alldata_custom_design,parent,false);

        return new AlldataItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlldataItemViewHolder holder, int position) {


        AllDataItems items = arrayList.get(position);
        String country = items.getCountry();
        String nconfirm = items.getNewConfirmed();
        String tconfirm = items.getTotalConfirmed();
        String ndeath = items.getNewDeaths();
        String tdeath = items.getTotalDeaths();
        String nrecover = items.getNewRecovered();
        String trecover = items.getTotalRecovered();
        String date = items.getDate();


        holder.country.setText("Country :- "+country);
        holder.nconfirm.setText("New Confirmed :- "+nconfirm);
        holder.tconfirm.setText("Total Confirmed :- "+tconfirm);
        holder.ndeath.setText("New Death :- "+ndeath);
        holder.tdeath.setText("Total Death :- "+tdeath);
        holder.nrecover.setText("New Recovered :- "+nrecover);
        holder.trecover.setText("Total Recovered :- "+trecover);
        holder.date.setText("Date :- "+date);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class AlldataItemViewHolder extends RecyclerView.ViewHolder {


        TextView country,nconfirm,tconfirm,ndeath,tdeath,nrecover,trecover,date;
        public AlldataItemViewHolder(@NonNull View itemView) {
            super(itemView);


            country = (TextView) itemView.findViewById(R.id.Country);
            nconfirm = (TextView) itemView.findViewById(R.id.newconfirmed);
            tconfirm = (TextView) itemView.findViewById(R.id.totalconfirmed);
            ndeath = (TextView) itemView.findViewById(R.id.newdeath);
            tdeath = (TextView) itemView.findViewById(R.id.totaldeath);
            nrecover = (TextView) itemView.findViewById(R.id.newrecoverd);
            trecover = (TextView) itemView.findViewById(R.id.totalrecovered);
            date = (TextView) itemView.findViewById(R.id.date);

        }
    }

}
