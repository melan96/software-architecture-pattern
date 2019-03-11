package gof_patterns.CommandPattern;

public class KitchenRoomLight implements Light{

	Light light;
	public void KitchenLight(Light light){
		this.light=light;
	}
	@Override
	public void lightOn() {
		// TODO Auto-generated method stub
		System.out.println("Lights On : Kitchen Room Light");

	}

	@Override
	public void lightOff() {
		// TODO Auto-generated method stub
		System.out.println("Lights Off : Kitchen Room Light");

	}

}
