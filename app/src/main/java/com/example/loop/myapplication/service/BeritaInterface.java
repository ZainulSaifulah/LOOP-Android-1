package com.example.loop.myapplication.service;

import com.example.loop.myapplication.model.Berita;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BeritaInterface {
    @GET("/api-students/get-news")
    Call<List<Berita>> getBerita();
}
