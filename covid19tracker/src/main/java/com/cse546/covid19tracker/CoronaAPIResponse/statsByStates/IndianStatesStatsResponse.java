package com.cse546.covid19tracker.CoronaAPIResponse.statsByStates;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IndianStatesStatsResponse {
	
	@SerializedName("response")
	@Expose
	private List<IndianStates> statesINResponse;

	public List<IndianStates> getStatesINResponse() {
		return statesINResponse;
	}

	public void setStatesINResponse(List<IndianStates> statesINResponse) {
		this.statesINResponse = statesINResponse;
	}

	/**
	 * @param statesINResponse
	 */
	public IndianStatesStatsResponse(List<IndianStates> statesINResponse) {
		super();
		this.statesINResponse = statesINResponse;
	}

	@Override
	public String toString() {
		return "IndianStatesStatsResponse [statesINResponse=" + statesINResponse + "]";
	}

}
