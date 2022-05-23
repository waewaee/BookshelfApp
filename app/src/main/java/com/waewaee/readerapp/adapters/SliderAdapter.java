package com.waewaee.readerapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.readerapp.R;
import com.waewaee.readerapp.viewholders.SliderViewHolder;

public class SliderAdapter extends RecyclerView.Adapter<SliderViewHolder> {

    public SliderAdapter(){

    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_view_slider, parent, false);
        return new SliderViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
