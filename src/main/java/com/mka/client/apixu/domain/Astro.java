package com.mka.client.apixu.domain;


public class Astro {

	
	private String moonset;

    private String sunset;

    private String sunrise;

    private String moonrise;

    
	public Astro() {
		super();
		
	}

	public Astro(String moonset, String sunset, String sunrise, String moonrise) {
		super();
		this.moonset = moonset;
		this.sunset = sunset;
		this.sunrise = sunrise;
		this.moonrise = moonrise;
	}

	public String getMoonset() {
		return moonset;
	}

	public void setMoonset(String moonset) {
		this.moonset = moonset;
	}

	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public String getMoonrise() {
		return moonrise;
	}

	public void setMoonrise(String moonrise) {
		this.moonrise = moonrise;
	}
	
    
    
}