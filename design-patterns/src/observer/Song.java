package observer;

import java.util.ArrayList;
import java.util.List;

public class Song implements Observable {
	private List<Observer> observers;
	private String song;
	
	public Song() {
		this.observers = new ArrayList<>();
	}
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setSong(this);
	}


	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}
	
	public void setSong(String song) {
		this.song = song;
		this.notifyObservers();
	}

	@Override
	public String getUpdate() {
		return this.song;
	}

}
