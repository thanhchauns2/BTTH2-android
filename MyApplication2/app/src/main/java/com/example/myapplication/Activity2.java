package com.example.myapplication;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    private EditText etImageLink;
    private Button btnUploadImage;
    private Button btnOpenMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Khởi tạo UI components
        etImageLink = findViewById(R.id.etImageLink);
        btnUploadImage = findViewById(R.id.btnUploadImage);
        btnOpenMaps = findViewById(R.id.btnOpenMaps);

        // Xử lý sự kiện click button Upload Image
        btnUploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy đường link ảnh từ EditText
                String imageLink = etImageLink.getText().toString();

                // TODO: Upload ảnh cá nhân lên (thêm logic xử lý tại đây)

                // Hiển thị thông báo thành công hoặc thất bại (tùy vào kết quả upload)
            }
        });

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
