    package com.example.a125lttd02_cky;

    import android.os.Bundle;
    import android.widget.ImageButton;
    import android.widget.TextView;
    import androidx.appcompat.app.AppCompatActivity;

    public class Maintenance_Detail_Activity extends AppCompatActivity {

        private TextView tvShopName, tvRating, tvDistance;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_maintenance_detail);

            // Ánh xạ View
            tvShopName = findViewById(R.id.tvShopName);
            tvRating = findViewById(R.id.tvRating);
            tvDistance = findViewById(R.id.tvDistance);
            ImageButton btnBack = findViewById(R.id.btnBack);

            // Gán dữ liệu mẫu (hoặc có thể lấy từ Intent)
            tvShopName.setText("TƯỜNG PHÁT 1");
            tvRating.setText("⭐ 4.9 (3.1k đánh giá)");
            tvDistance.setText("Cách bạn 2.0km");

            // Nút quay lại
            btnBack.setOnClickListener(v -> finish());
        }
    }
