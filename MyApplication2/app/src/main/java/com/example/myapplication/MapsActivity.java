package com.example.myapplication;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Tạo đối tượng Button cho nút Back
        Button btnBack = findViewById(R.id.btnBack);
        // Đăng ký sự kiện click cho nút Back
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi click nút Back, finish activity hiện tại
                finish();
            }
        });

        // Tiếp tục xử lý các chức năng khác của ứng dụng
        // ...
    }
}