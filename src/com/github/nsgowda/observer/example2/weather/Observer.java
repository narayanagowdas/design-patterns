package com.github.nsgowda.observer.example2.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
