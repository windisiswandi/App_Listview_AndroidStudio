package com.example.uts_pemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickIcon(View v){
        Intent intent = new Intent(MainActivity.this, MyProfile.class);
        startActivity(intent);
    }

    public void onClickPadangFood(View v){ bukaGaleryFood("Padang Food"); }
    public void onClickLombokFood(View v){ bukaGaleryFood("Lombok Food"); }
    public void onClickPalembangFood(View v){ bukaGaleryFood("Palembang Food"); }
    public void onClickAcehFood(View v){ bukaGaleryFood("Aceh Food"); }

    void bukaGaleryFood(String jenisFood)
    {
        Intent intent = new Intent(MainActivity.this, GaleryFood.class);
        intent.putExtra("KATEGORI_FOOD", jenisFood);
        startActivity(intent);
    }

}