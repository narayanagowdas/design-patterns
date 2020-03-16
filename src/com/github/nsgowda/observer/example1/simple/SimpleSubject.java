package com.github.nsgowda.observer.example1.simple;

import java.util.ArrayList;

public class SimpleSubject implements Subject {
	private ArrayList<Observer> observers;
	private int value = 0;
	
	public SimpleSubject() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(com.github.nsgowda.observer.example1.simple.Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(com.github.nsgowda.observer.example1.simple.Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}