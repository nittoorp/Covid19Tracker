package com.cse546.covid19tracker.service.REST;

import com.cse546.covid19tracker.newsAPIResponse.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsHeadlinesEndpoint {
	@GET("/v2/top-headlines")
	Call<NewsResponse> topHeadlines(@Query("apiKey") String key,
			@Query("country") String country,
			@Query("q") String query);

}
