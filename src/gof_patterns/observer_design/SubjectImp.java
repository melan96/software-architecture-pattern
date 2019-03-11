package observer_design;

import java.util.ArrayList;
import java.util.List;

public class SubjectImp implements Subject{

	private String status;
	List<Observer> observers = new ArrayList<Observer>();
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observers) {
			o.update(this);
		}
		
	}

}
