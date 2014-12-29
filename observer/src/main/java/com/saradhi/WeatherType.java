package com.saradhi;

public enum WeatherType {

	SUNNY, RAINY, WINDY, COLD;

	@Override
	public String toString() {
		return this.name().toLowerCase();
	}

}
