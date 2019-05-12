package com.example.loop.myapplication.service;

import com.example.loop.myapplication.model.Berita;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    private static final String BASE_URL = "http://notes.lpkia.ac.id";
    private BeritaInterface beritaInterface;


    public RetrofitService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        beritaInterface = retrofit.create(BeritaInterface.class);
    }

    public Call<List<Berita>> getListBerita() {
        return beritaInterface.getBerita();
    }


}
