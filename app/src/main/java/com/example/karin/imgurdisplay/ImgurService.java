package com.example.karin.imgurdisplay;

import com.google.gson.JsonElement;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;

public interface ImgurService {

    @Headers("Authorization: Client-ID " + Config.CLIENT_ID)
    @GET("/album/{albumHash}")
    void getAlbumImages(@Path("albumHash") String albumHash,  Callback<JsonElement> cb);
}
