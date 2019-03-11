package gof_patterns.bridge_pattern;

public interface RemoteController {

	public void on();
	public void off();
	public void tune(int channel);
}
