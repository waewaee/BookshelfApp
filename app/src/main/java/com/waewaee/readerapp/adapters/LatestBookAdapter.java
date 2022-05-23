package com.waewaee.readerapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.readerapp.viewholders.LatestBookViewHolder;
import com.waewaee.readerapp.R;

public class LatestBookAdapter extends RecyclerView.Adapter<LatestBookViewHolder> {

    public LatestBookAdapter(){

    }

    @NonNull
    @Override
    public LatestBookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_view_latest, parent, false);
        return new LatestBookViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull LatestBookViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
