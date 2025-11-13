package com.example.a125lttd02_cky;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Maintenance_History_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance_history_screen);

        // Khởi tạo RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerViewHistory);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Tạo dữ liệu mẫu
        List<MaintenanceHistoryItem> items = new ArrayList<>();
        items.add(new MaintenanceHistoryItem("TƯỜNG PHÁT 1", "02/09/2025", "6,256"));
        items.add(new MaintenanceHistoryItem("TƯỜNG PHÁT 2", "15/08/2025", "5,800"));
        items.add(new MaintenanceHistoryItem("TƯỜNG PHÁT 3", "28/07/2025", "5,200"));
        items.add(new MaintenanceHistoryItem("TƯỜNG PHÁT 1", "10/07/2025", "4,500"));
        items.add(new MaintenanceHistoryItem("TƯỜNG PHÁT 2", "22/06/2025", "3,900"));

        // Gắn Adapter vào RecyclerView
        MaintenanceHistoryAdapter adapter = new MaintenanceHistoryAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}
