package com.cse546.covid19tracker.StoresNearMeResponse;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geometry {

	@SerializedName("location")
	@Expose
	private Location location;

	/**
	 * @param location
	 */
	public Geometry(Location location) {
		super();
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Geometry [location=" + location + "]";
	}

}
