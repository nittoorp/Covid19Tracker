package com.cse546.covid19tracker.service.REST;

import com.cse546.covid19tracker.CoronaAPIResponse.TotalStatsResponse;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;


public interface WorldStatsEndpoint {

	@GET("/coronavirus/{page_id}.php")
	Call<TotalStatsResponse> worldStats(@Path(value ="page_id") String page_id,
			@Header("x-rapidapi-key") String key,
			@Header("x-rapidapi-host")  String host	
			);
}
