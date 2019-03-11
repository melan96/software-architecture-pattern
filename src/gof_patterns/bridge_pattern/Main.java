package gof_patterns.bridge_pattern;

public class Main {

	public static void main(String[] args) {
		
		TV lgTv = new LGTV();
		TV sonyTv = new SonyTV();
		
		new RemoteControllerImp(lgTv).on();
		new RemoteControllerImp(sonyTv).on();
	}
}
