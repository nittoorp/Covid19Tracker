package com.cse546.covid19tracker.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cse546.covid19tracker.config.Config;
import com.cse546.covid19tracker.newsAPIResponse.NewsContent;
import com.cse546.covid19tracker.newsAPIResponse.NewsResponse;
import com.cse546.covid19tracker.service.REST.API;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Component
public class NewsHeadlines {

	NewsResponse nr;
	public NewsResponse newsService(String country) {
		Call<NewsResponse> call = API.newsHeadlines().topHeadlines(Config.NEWS_API_KEY,country , "corona");
		call.enqueue(new Callback<NewsResponse>() {

			public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
				nr = response.body();



				if(nr!=null) {
					displayOnPage(nr.getNewsResponse());
					//System.out.println(storesNearMe);
				}

			}


			public void onFailure(Call<NewsResponse> call, Throwable t) {
				System.out.print(t.getMessage());
			}
		});
		return nr;
	}
	public void displayOnPage( List<NewsContent> stores) {
		System.out.println(stores);


	}

}


