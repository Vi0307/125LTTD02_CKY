package com.example.a125lttd02_cky;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MaintenanceHistoryAdapter extends RecyclerView.Adapter<MaintenanceHistoryAdapter.ViewHolder> {
    private List<MaintenanceHistoryItem> items;

    public MaintenanceHistoryAdapter(List<MaintenanceHistoryItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_maintenance_history, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MaintenanceHistoryItem item = items.get(position);
        holder.tvDealer.setText("Đại lý: " + item.getDealer());
        holder.tvDate.setText(item.getDate());
        holder.tvKm.setText(item.getKm());
    }

    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvDealer;
        TextView tvDate;
        TextView tvKm;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDealer = itemView.findViewById(R.id.tvDealer);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvKm = itemView.findViewById(R.id.tvKm);
        }
    }
}

