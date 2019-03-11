package observer_design;

public interface Subject {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	public void setStatus(String string);
	public String getStatus();
	
	
}
