package com.example.uts_pemrogramanmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.uts_pemrogramanmobile.model.DataFood;
import com.example.uts_pemrogramanmobile.model.Foods;

import java.util.ArrayList;

public class ProfileFood extends AppCompatActivity {
    ArrayList<Foods> food;
    Foods food_selected;
    TextView titleApp, nama, harga, detail, size;
    ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_food);
        Intent intent = getIntent();
        food_selected = (Foods) intent.getSerializableExtra("FOOD_SELECTED");
        initViewContent();
        setViewContent();
    }

    void initViewContent() {
        titleApp = findViewById(R.id.food_content_title);
        nama = findViewById(R.id.food_content_nama);
        harga = findViewById(R.id.food_content_price);
        detail = findViewById(R.id.food_content_detail);
        size = findViewById(R.id.food_content_size);
        gambar = findViewById(R.id.food_content_img);
    }

    void setViewContent() {
        titleApp.setText(food_selected.getNamaFood());
        nama.setText(food_selected.getNamaFood());
        harga.setText(food_selected.getPriceFood());
        detail.setText(food_selected.getDetailFood());
        size.setText(food_selected.getSize());
        gambar.setImageDrawable(getDrawable(food_selected.getGambarFood()));
    }
}
