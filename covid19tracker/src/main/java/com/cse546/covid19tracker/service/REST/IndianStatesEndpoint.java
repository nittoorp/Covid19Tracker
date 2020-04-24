package com.cse546.covid19tracker.service.REST;

import com.cse546.covid19tracker.CoronaAPIResponse.statsByStates.IndianStatesStatsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface IndianStatesEndpoint {

	@GET("/getIndiaStateData")
	Call<IndianStatesStatsResponse> indianStates(@Header("x-rapidapi-key") String key,
			@Header("x-rapidapi-host")  String host	
			);

}
