package com.cse546.covid19tracker.service.REST;


import com.cse546.covid19tracker.config.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;




public class API {

	private static <T> T builder(Class<T> endpoint, String URL) {
		return new Retrofit.Builder()
				.baseUrl(URL)
				.addConverterFactory(GsonConverterFactory.create())
				.build()
				.create(endpoint);
	}

	public static storesNearMeEndpoint storesNearMe() {
		return builder(storesNearMeEndpoint.class,Config.PLACES_NEAR_ME_API_BASE_URL);
	}

	public static WorldStatsEndpoint worldStats() {
		return builder(WorldStatsEndpoint.class,Config.Covid_API_BASE_URL);
	}

	public static StatsByCountryEndpoint statsByCountry() {
		return builder(StatsByCountryEndpoint.class,Config.Covid_API_BASE_URL);
	}
	
	public static StatsByStatesINUSAEndpoint statsByStateINUS() {
		return builder(StatsByStatesINUSAEndpoint.class,Config.Covid_USA_State_URL);
	}
	
	public static IndianStatesEndpoint indianStatesStats() {
		return builder(IndianStatesEndpoint.class,Config.COVID_INDIA_STATES_URL);
	}
	
	public static NewsHeadlinesEndpoint newsHeadlines() {
		return builder(NewsHeadlinesEndpoint.class, Config.NEWS_API_URL);
	}
	
}
