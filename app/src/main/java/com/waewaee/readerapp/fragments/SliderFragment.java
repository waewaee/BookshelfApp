package com.waewaee.readerapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.readerapp.R;
import com.waewaee.readerapp.adapters.SliderAdapter;

public class SliderFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_slider, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView rvSlider = view.findViewById(R.id.rv_slider);
        SliderAdapter adapter = new SliderAdapter();
        rvSlider.setLayoutManager(new LinearLayoutManager(view.getContext()
                , LinearLayoutManager.HORIZONTAL, false));
        rvSlider.setAdapter(adapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
