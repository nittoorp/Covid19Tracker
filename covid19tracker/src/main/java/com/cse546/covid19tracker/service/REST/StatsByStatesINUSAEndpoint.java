package com.cse546.covid19tracker.service.REST;


import com.cse546.covid19tracker.CoronaAPIResponse.statsByStates.StatsByStateResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface StatsByStatesINUSAEndpoint {

	@GET("/{country}")
	Call<StatsByStateResponse> statsByState(@Path(value ="country") String country,@Header("x-rapidapi-key") String key,
			@Header("x-rapidapi-host")  String host	
			);
}

//