package com.example.asus.jsonsample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class JSONAdapter extends ArrayAdapter<Data> {
    public JSONAdapter(@NonNull Context context, @NonNull List<Data> datas) {
        super(context, 0, datas);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.data_item, parent, false);
        }
        Data data = getItem(position);

        TextView magTextView = convertView.findViewById(R.id.id);
        TextView placeTextView = convertView.findViewById(R.id.name);

        magTextView.setText(String.valueOf(data.getId()));
        placeTextView.setText(data.getName());

        return convertView;
    }
}
