package com.waewaee.readerapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.readerapp.viewholders.PopularViewHolder;
import com.waewaee.readerapp.R;

public class PopularAdapter extends RecyclerView.Adapter<PopularViewHolder> {

    public PopularAdapter(){

    }

    @NonNull
    @Override
    public PopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_view_popular, parent, false);
        return new PopularViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
