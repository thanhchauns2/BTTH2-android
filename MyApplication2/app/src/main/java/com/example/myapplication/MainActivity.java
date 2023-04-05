package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] danhSachDiaDanh = {"Hồ Gươm", "Lăng Chủ Tịch", "Cột cờ Hà Nội", "Chùa Một Cột", "Hồ Tây", "Chùa Trấn Quốc"};
    private String[] moTa = {"Danh thắng lâu đời của Hà Nội.", "Lịch sử, văn hóa, độc đáo.", "Biểu tượng thủ đô Hà Nội.",
            "Điểm du lịch nổi tiếng.", "Điểm du lịch nổi tiếng.", "Lịch sử, văn hóa, độc đáo."};
    private double[] lons = {21.0285, 21.037396, 21.0285, 21.037445, 21.0707, 21.0470};
    private double[] lats = {105.8542, 105.832565 , 105.8542, 105.832540, 105.8038, 105.8458};
    private String[] imgs = {"hoan_kiem", "lang_chu_tich", "cot_co_ha_no", "chua_mot_cot", "ho_tay", "chua_tran_quoc"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ ListView từ layout
        listView = findViewById(R.id.listView);

        // Tạo ArrayAdapter để gán dữ liệu cho ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, danhSachDiaDanh);

        // Gán adapter cho ListView
        listView.setAdapter(adapter);

        // Thiết lập sự kiện click cho các mục trong ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Mở Activity2 khi click vào mục trong ListView
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("long", lons[position]);
                intent.putExtra("lat", lats[position]);
                intent.putExtra("tenDiaDanh", danhSachDiaDanh[position]);
                intent.putExtra("moTa", moTa[position]);
                intent.putExtra("imgl", imgs[position]);
                startActivity(intent);
            }
        });
    }
}