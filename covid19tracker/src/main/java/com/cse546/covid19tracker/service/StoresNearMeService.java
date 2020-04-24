package com.cse546.covid19tracker.service;





import org.springframework.stereotype.Component;


import com.cse546.covid19tracker.StoresNearMeResponse.StoresNearMeResponse;
import com.cse546.covid19tracker.config.Config;
import com.cse546.covid19tracker.service.REST.API;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Component
public class StoresNearMeService {

	StoresNearMeResponse stores;
	public StoresNearMeResponse startService(Double lat,Double lon) {
		
		Call<StoresNearMeResponse> call = API.storesNearMe().searchStoresNearMe(Config.PLACES_NEAR_ME__API_KEY, lat+","+lon, new Integer(15000).toString(), "groceries", "groceries");
		
		call.enqueue(new Callback<StoresNearMeResponse>() {

			public void onResponse(Call<StoresNearMeResponse> call, Response<StoresNearMeResponse> response) {
				 stores = response.body();
			
				//stores = storesResponse.getResult();
				
				if(stores!=null) {
					displayOnPage(stores);
					//System.out.println(storesNearMe);
				}

			}


			public void onFailure(Call<StoresNearMeResponse> call, Throwable t) {
				System.out.print(t.getMessage());
			}
		});
		return stores;
	}
	public void displayOnPage(StoresNearMeResponse stores) {
		System.out.println(stores);
		
		
	}
	
}
