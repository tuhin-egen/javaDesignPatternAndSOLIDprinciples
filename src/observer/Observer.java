package observer;

public interface Observer {
	
	/**
	 * this method will update the observer used by subject
	 */
	public void update();
	
	public void setSubject(Subject subject);

}
