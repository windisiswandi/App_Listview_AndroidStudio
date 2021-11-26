package com.example.uts_pemrogramanmobile;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyProfile extends AppCompatActivity {
    ImageView icon_back, ic_setting;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);
        Intent intent = new Intent(this, MainActivity.class);
        icon_back = findViewById(R.id.icon_back_pofile);
        ic_setting = findViewById(R.id.ic_setting_profile);

        icon_back.setOnClickListener(View -> {
            startActivity(intent);
        });

        ic_setting.setOnClickListener(View -> {
            Toast.makeText(MyProfile.this, "Anda mengklik icon setting", Toast.LENGTH_SHORT).show();
        });
    }
}
