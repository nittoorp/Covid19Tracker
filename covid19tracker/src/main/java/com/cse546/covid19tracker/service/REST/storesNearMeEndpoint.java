package com.cse546.covid19tracker.service.REST;


import com.cse546.covid19tracker.StoresNearMeResponse.StoresNearMeResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface storesNearMeEndpoint {
	@GET("/maps/api/place/nearbysearch/json")
	Call<StoresNearMeResponse> searchStoresNearMe(@Query("key") String key,

			@Query("location") String location,
			@Query("radius") String radius,
			@Query("type") String type,
			@Query("keyword") String keyword);
}
