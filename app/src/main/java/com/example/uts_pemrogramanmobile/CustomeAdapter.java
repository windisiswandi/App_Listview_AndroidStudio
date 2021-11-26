package com.example.uts_pemrogramanmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uts_pemrogramanmobile.model.Foods;

import java.util.ArrayList;

public class CustomeAdapter extends ArrayAdapter {
    ArrayList<Foods> data_food = new ArrayList();
    LayoutInflater inflater;
    TextView titleListItem, priceListItem;
    ImageView imgListItem;
    Context context;
    public CustomeAdapter(Context context, ArrayList<Foods> food) {
        super(context, R.layout.row_custom_listview, food);
        this.data_food = food;
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.row_custom_listview, parent, false);
        Foods food = data_food.get(position);

        titleListItem = convertView.findViewById(R.id.title_row_custom_list);
        priceListItem = convertView.findViewById(R.id.price_row_custom_list);
        imgListItem = convertView.findViewById(R.id.img_row_custom_list);

        titleListItem.setText(food.getNamaFood());
        priceListItem.setText(food.getPriceFood());
        imgListItem.setImageDrawable(context.getDrawable(food.getGambarFood()));
        return convertView;
    }
}
