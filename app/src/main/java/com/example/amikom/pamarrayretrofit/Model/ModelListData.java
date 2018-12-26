package com.example.amikom.pamarrayretrofit.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by amikom on 26/12/2018.
 */

@SuppressWarnings("unused")
public class ModelListData {
    @SerializedName("ikon")
    private String ikon;
    @SerializedName("gambar")
    private String  gambar;
    @SerializedName("nama")
    private String nama;
    @SerializedName("posisi")
    private String posisi;
    @SerializedName("negara")
    private String negara;

    public ModelListData(String ikon, String gambar, String nama, String posisi, String negara) {
        this.ikon = ikon;
        this.gambar = gambar;
        this.nama = nama;
        this.posisi = posisi;
        this.negara = negara;
    }

    public String getIkon() {
        return ikon;
    }

    public void setIkon(String ikon) {
        this.ikon = ikon;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }
}
