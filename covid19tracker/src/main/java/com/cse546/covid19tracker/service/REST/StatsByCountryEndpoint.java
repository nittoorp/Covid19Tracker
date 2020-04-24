package com.cse546.covid19tracker.service.REST;


import com.cse546.covid19tracker.CoronaAPIResponse.statsByCountry.StatsByCountryResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface StatsByCountryEndpoint {

	@GET("/coronavirus/cases_by_country.php")
	Call<StatsByCountryResponse> statsByCountry(@Header("x-rapidapi-key") String key,
			@Header("x-rapidapi-host")  String host	
			);
}
