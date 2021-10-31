package com.example.pertemuan4_recycleview;

public class item {
    private String namavape,merk,harga;
    private int logo;

    public item(String namavape, String merk, String harga, int logo) {
        this.namavape = namavape;
        this.merk = merk;
        this.harga = harga;
        this.logo = logo;
    }

    public String getNamavape() {
        return namavape;
    }

    public void setNamavape(String namavape) {
        this.namavape = namavape;
    }

    public String getMerk() {
        return merk;
    }

    public void setHarga(String harga) {
        this.merk = merk;
    }

    public String getHarga() {
        return harga;
    }

    public void setharga(String harga) {
        this.harga = harga;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
