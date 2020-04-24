package com.cse546.covid19tracker.StoresNearMeResponse;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

	@Override
	public String toString() {
		return "Location [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	@SerializedName("lat")
	@Expose
	private double latitude;
	@SerializedName("lng")
	@Expose
	private double longitude;
	/**
	 * @param latitude
	 * @param longitude
	 */
	public Location(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}
