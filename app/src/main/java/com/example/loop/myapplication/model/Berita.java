package com.example.loop.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Berita {
    @SerializedName("id")
    private int id;

    @SerializedName("news_date")
    private String tanggal;

    @SerializedName("title")
    private String judul;

    @SerializedName("preview")
    private String deskripsi;

    @SerializedName("content")
    private String konten;

    @SerializedName("picture")
    private String foto;

    @SerializedName("tag")
    private String tag;

    public Berita(int id, String tanggal, String judul, String deskripsi, String konten, String foto, String tag) {
        this.id = id;
        this.tanggal = tanggal;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.konten = konten;
        this.foto = foto;
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKonten() {
        return konten;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Berita{" +
                "id=" + id +
                ", tanggal='" + tanggal + '\'' +
                ", judul='" + judul + '\'' +
                ", deskripsi='" + deskripsi + '\'' +
                ", konten='" + konten + '\'' +
                ", foto='" + foto + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}


