package com.prabhakar.retrofit_iiiuploadimage;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface APIService {
    @Multipart
    @Headers("Authorization:Client-ID 86648e752c555ed")
    @POST("3/image")
    Call<ResponseDTO> uploadImage(
            @Part MultipartBody.Part file,
            @Part("title") String title

    );
}
