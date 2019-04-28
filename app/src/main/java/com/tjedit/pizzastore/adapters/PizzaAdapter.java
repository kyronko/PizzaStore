package com.tjedit.pizzastore.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tjedit.pizzastore.R;
import com.tjedit.pizzastore.datas.PizzaData;

import java.util.List;

public class PizzaAdapter extends ArrayAdapter<PizzaData> {
    public PizzaAdapter(Context context, List<PizzaData> list) {
        super(context, R.layout.activity_main, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    Context mContext;
    List<PizzaData> mList;
    LayoutInflater inf;


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.pizza_list_item, null);
        }
         PizzaData pizzaData = mList.get(position);

        TextView pizzaNameTxt = row.findViewById(R.id.pizzaNameTxt);
        TextView openTimeTxt = row.findViewById(R.id.openTimeTxt);
        ImageView logoImageView = row.findViewById(R.id.logoImageView);
        Glide.with(mContext).load(pizzaData.imageURL).into(logoImageView);

        pizzaNameTxt.setText(pizzaData.pizzaStoreNameTxt);
        openTimeTxt.setText(pizzaData.openTimeTxt);

        return row;
    }
}

