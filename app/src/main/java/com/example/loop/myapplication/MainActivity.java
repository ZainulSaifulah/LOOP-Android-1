package com.example.loop.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.loop.myapplication.model.Berita;
import com.example.loop.myapplication.service.RetrofitService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RetrofitService retrofitService = new RetrofitService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        retrofitService.getListBerita().enqueue(new Callback<List<Berita>>() {
            @Override
            public void onResponse(Call<List<Berita>> call, Response<List<Berita>> response) {
                Log.v("Response", response.body().get(1).toString());
            }

            @Override
            public void onFailure(Call<List<Berita>> call, Throwable t) {
                Log.e("MainActivity", t.toString());
            }
        });
    }
}
