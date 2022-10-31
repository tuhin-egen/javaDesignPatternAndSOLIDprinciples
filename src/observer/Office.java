package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// this is my concreteSubject class
public class Office implements Subject{

	private List<Observer> observers;
	private boolean change;
	private String message;

	private final Object MUTEX = new Object();



	public Office() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		if(observer == null) {
			throw new NullPointerException("Null observer");
		}

		synchronized (MUTEX) {
			if(!observers.contains(observer)) {
				observers.add(observer);
			}
		}

	}

	@Override
	public void unRegister(Observer observer) {
		synchronized (MUTEX) {
			if(observers.contains(observer)) {
				observers.remove(observer);
			}
		}
	}

	@Override
	public void notifyObserver() {
		 List<Observer> localObservers = null;
		 synchronized (MUTEX) {
				if(!change) 
					return;
					
					localObservers = new ArrayList<>(this.observers);
					this.change = false;
				
				for(Observer obs : localObservers) {
					obs.update();
				}
			}

	}

	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}
	
	// Office (concrete subject) will push message to the Employee (concrete observer)
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
		this.message = msg;
		this.change = true;
		notifyObserver();
		this.message = null;
	}

}
