package com.cse546.covid19tracker.service;



import org.springframework.stereotype.Component;

import com.cse546.covid19tracker.CoronaAPIResponse.TotalStatsResponse;
import com.cse546.covid19tracker.CoronaAPIResponse.statsByCountry.StatsByCountryResponse;
import com.cse546.covid19tracker.CoronaAPIResponse.statsByStates.IndianStatesStatsResponse;
import com.cse546.covid19tracker.CoronaAPIResponse.statsByStates.StatsByStateResponse;
import com.cse546.covid19tracker.config.Config;
import com.cse546.covid19tracker.service.REST.API;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Component
public class TotalStatsCovid {

	TotalStatsResponse tsr;
	StatsByCountryResponse scr;
	StatsByStateResponse ssr;
	IndianStatesStatsResponse issr;
	

	// World service
	public TotalStatsResponse startService() {

		Call<TotalStatsResponse> call = API.worldStats().worldStats(Config.Covid_World_Stats ,Config.Covid_API_KEY,Config.Covid_API_HOST);
		call.enqueue(new Callback<TotalStatsResponse>() {

			public void onResponse(Call<TotalStatsResponse> call, Response<TotalStatsResponse> response) {
				 tsr = response.body();


				if(tsr!=null)
					displayOnPage(tsr);
				//System.out.println(storesNearMe);
			}

			public void onFailure(Call<TotalStatsResponse> call, Throwable t) {
				// TODO Auto-generated method stub

			}





		});
		return tsr;
	}
	public void displayOnPage(TotalStatsResponse stores) {
		System.out.println(stores);


	}



	// World Service

	public StatsByCountryResponse worldStatsService() {

		Call<StatsByCountryResponse> call = API.statsByCountry().statsByCountry(Config.Covid_API_KEY, Config.Covid_API_HOST);
		call.enqueue(new Callback<StatsByCountryResponse>() {

			public void onResponse(Call<StatsByCountryResponse> call, Response<StatsByCountryResponse> response) {
				 scr = response.body();


				if(scr!=null)
					displayWolrdStatsOnPage(scr);
				//System.out.println(storesNearMe);
			}

			public void onFailure(Call<StatsByCountryResponse> call, Throwable t) {
				// TODO Auto-generated method stub

			}





		});
		return scr;
	}
	public void displayWolrdStatsOnPage(StatsByCountryResponse stores) {
		System.out.println(stores);


	}

	// State wise service
	public StatsByStateResponse stateService() {
		
			Call<StatsByStateResponse> call = API.statsByStateINUS().statsByState("us",Config.Covid_API_KEY, Config.Covid_stats_by_state_header_host);
			call.enqueue(new Callback<StatsByStateResponse>() {

				public void onResponse(Call<StatsByStateResponse> call, Response<StatsByStateResponse> response) {
					 ssr = response.body();


					if(ssr!=null)
						displayUSStatesOnPage(ssr);
					//System.out.println(storesNearMe);
				}

				public void onFailure(Call<StatsByStateResponse> call, Throwable t) {
					// TODO Auto-generated method stub
					System.out.println(t.getMessage());
				}





			});
		
		return ssr;
	}
	public void displayUSStatesOnPage(StatsByStateResponse stats) {
		System.out.println(stats);


	}

	// Indian State Wise Data
	public IndianStatesStatsResponse stateServiceForIndia() {
		
		Call<IndianStatesStatsResponse> call = API.indianStatesStats().indianStates(Config.Covid_API_KEY, Config.COVID_INDIA_STATES_HOST);
		call.enqueue(new Callback<IndianStatesStatsResponse>() {

			public void onResponse(Call<IndianStatesStatsResponse> call, Response<IndianStatesStatsResponse> response) {
				 issr = response.body();


				if(issr!=null)
					displayINStatesOnPage(issr);
				//System.out.println(storesNearMe);
			}

			public void onFailure(Call<IndianStatesStatsResponse> call, Throwable t) {
				// TODO Auto-generated method stub
				System.out.println(t.getMessage());
			}





		});
		return issr;

	}
	public void displayINStatesOnPage(IndianStatesStatsResponse stats) {
		System.out.println(stats);


	}

}
