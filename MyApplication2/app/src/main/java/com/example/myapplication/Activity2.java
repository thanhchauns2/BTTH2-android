package com.example.myapplication;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {

    private Button btnOpenMaps;
    private EditText editText;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Khởi tạo UI components
        btnOpenMaps = findViewById(R.id.btnOpenMaps);
        editText = findViewById(R.id.editText);
        imageView = findViewById(R.id.imageView);

        final double longtitude = getIntent().getIntExtra("long", 0);
        final double latitude = getIntent().getIntExtra("lat", 0);
        final String tenDiaDanh = getIntent().getStringExtra("tenDiaDanh");
        String moTa = getIntent().getStringExtra("moTa");
        String imgl = getIntent().getStringExtra("imgl");

//        String tmp = Integer.toString(getIntent().getIntExtra("id", 0));

        editText.setText(moTa);
        int resourceId = getResources().getIdentifier(imgl, "drawable", getPackageName());

        imageView.setImageResource(resourceId);

        // Xử lý sự kiện click button Open Maps
        btnOpenMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mở ứng dụng Google Maps với vị trí hiện tại
                Uri gmmIntentUri = Uri.parse("geo:" + latitude + "," + longtitude + "?q=" + tenDiaDanh);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}
