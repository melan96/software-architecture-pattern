package gof_patterns.bridge_pattern;

public class SonyTV implements TV{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("SONY : ON");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("SONY : OFF");
	}

	@Override
	public void tune(int channel) {
		// TODO Auto-generated method stub
		System.out.println("SONY : Tune to  :  "+channel);
	}

}
