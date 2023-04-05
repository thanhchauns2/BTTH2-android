package com.example.myapplication;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    private Button btnOpenMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Khởi tạo UI components
        btnOpenMaps = findViewById(R.id.btnOpenMaps);

        double longtitude = getIntent().getIntExtra("long", 0);
        double latitude = getIntent().getIntExtra("lat", 0);

        // Xử lý sự kiện click button Open Maps
        btnOpenMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mở ứng dụng Google Maps với vị trí hiện tại
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=your_location");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}
