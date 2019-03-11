package gof_patterns.bridge_pattern;

public class RemoteControllerImp implements RemoteController{

	TV tv;
	
	RemoteControllerImp(TV tv){
		this.tv=tv;
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		tv.on();
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		tv.off();
	}

	@Override
	public void tune(int channel) {
		// TODO Auto-generated method stub
		tv.tune(channel);
		
	}

}
