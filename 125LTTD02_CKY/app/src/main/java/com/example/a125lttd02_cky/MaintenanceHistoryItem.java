package com.example.a125lttd02_cky;

public class MaintenanceHistoryItem {
    private String dealer;
    private String date;
    private String km;

    public MaintenanceHistoryItem(String dealer, String date, String km) {
        this.dealer = dealer;
        this.date = date;
        this.km = km;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }
}

