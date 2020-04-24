package com.cse546.covid19tracker.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cse546.covid19tracker.CoronaAPIResponse.TotalStatsResponse;
import com.cse546.covid19tracker.CoronaAPIResponse.statsByCountry.StatsByCountryResponse;
import com.cse546.covid19tracker.CoronaAPIResponse.statsByStates.IndianStatesStatsResponse;
import com.cse546.covid19tracker.CoronaAPIResponse.statsByStates.StatsByStateResponse;

import com.cse546.covid19tracker.StoresNearMeResponse.StoresNearMeResponse;
import com.cse546.covid19tracker.newsAPIResponse.NewsResponse;
import com.cse546.covid19tracker.service.NewsHeadlines;
import com.cse546.covid19tracker.service.StoresNearMeService;
import com.cse546.covid19tracker.service.TotalStatsCovid;



@Controller
public class HomeController {

	@Autowired
	private StoresNearMeService service;
	@RequestMapping("/stores")
	@ResponseBody
	public StoresNearMeResponse startPage(@RequestParam("lat") Double lat,@RequestParam("lon") Double lon) {
		StoresNearMeResponse snm = service.startService(lat,lon);
		return snm;
	}

	@Autowired
	private TotalStatsCovid statsService;
	@RequestMapping("/")
	@ResponseBody
	public ResponseEntity<TotalStatsResponse> statsPage() {
		TotalStatsResponse tsr =statsService.startService();
		return new ResponseEntity<TotalStatsResponse>(tsr, HttpStatus.OK);
	}
	@RequestMapping("/stats/world")
	@ResponseBody
	public ResponseEntity<StatsByCountryResponse> worldStatsPage() {
		StatsByCountryResponse scr =statsService.worldStatsService();
		return new ResponseEntity<StatsByCountryResponse>(scr, HttpStatus.OK);
	}

	@Autowired
	private TotalStatsCovid statesService;
	@RequestMapping("/us/states")
	@ResponseBody
	public ResponseEntity<StatsByStateResponse> statesPage () {
		StatsByStateResponse ssr =statesService.stateService();
		return new ResponseEntity<StatsByStateResponse>(ssr, HttpStatus.OK);
	}
	@RequestMapping("/in/states")
	@ResponseBody
	public ResponseEntity<IndianStatesStatsResponse> statesINPage () {
		IndianStatesStatsResponse issr =statesService.stateServiceForIndia();
		return new ResponseEntity<IndianStatesStatsResponse>(issr, HttpStatus.OK);
	}
	
	@Autowired
	private NewsHeadlines newsService;
	@RequestMapping("/news/{country}")
	@ResponseBody
	public ResponseEntity<NewsResponse> newsPage(@RequestParam("country") String country) {
		NewsResponse nr = newsService.newsService(country);
		return new ResponseEntity<NewsResponse>(nr, HttpStatus.OK);
	}


}
