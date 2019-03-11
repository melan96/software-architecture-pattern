package gof_patterns.CommandPattern;

public class LivingRoomLight implements Light {

	Light light;
	public void LivingRoomLight(Light light){
		this.light=light;
	}

	public  void lightOn(){
		System.out.println("Lights On : Living Room Light");
	}
	
	public  void lightOff(){
		System.out.println("Lights Off : Living Room Light");
	}
	
}
