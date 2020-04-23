package com.icha.modulsebelas.api

import com.icha.modulsebelas.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>

}