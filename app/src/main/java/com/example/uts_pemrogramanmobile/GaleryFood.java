package com.example.uts_pemrogramanmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.uts_pemrogramanmobile.model.Foods;
import com.example.uts_pemrogramanmobile.model.DataFood;

import java.util.ArrayList;

public class GaleryFood extends AppCompatActivity {
//    public static final String FOOD_SELECTED = "foods_obj_key";
    ArrayList<Foods> data_foods = new ArrayList();
    String kategori_food;
    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_content_list);
        TextView titleFoodContent = findViewById(R.id.title_food_content_list);
        LinearLayout linearLayout = findViewById(R.id.shape_gradient);
        Intent intent = getIntent();
        kategori_food = intent.getStringExtra("KATEGORI_FOOD");
        titleFoodContent.setText(kategori_food);
        data_foods = DataFood.getDataFoodByJenis(kategori_food);
        linearLayout.setBackground(getDrawable(data_foods.get(0).getGambarFood()));
        setupListView();
    }

    void setupListView() {
        listView = findViewById(R.id.listView_content);
        CustomeAdapter adapter = new CustomeAdapter(this, data_foods);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onItemClick);
    }

    private AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Foods food_selected = data_foods.get(position);
            Intent intent = new Intent(GaleryFood.this, ProfileFood.class);
            intent.putExtra("FOOD_SELECTED", food_selected);
            startActivity(intent);
        }
    };
}
