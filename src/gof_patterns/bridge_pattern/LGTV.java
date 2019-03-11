package gof_patterns.bridge_pattern;

public class LGTV implements TV{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("LG : ON");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("LG : OFF");
	}

	@Override
	public void tune(int channel) {
		// TODO Auto-generated method stub
		System.out.println("LG : Tune to  :  "+channel);
	}
}
