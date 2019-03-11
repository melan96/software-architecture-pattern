package CommandPattern;

public class Main {

	
	public static void main(String[] args){
		
		Light livingRoom = new LivingRoomLight();
		Light kitchenLight = new KitchenRoomLight();
		
		Command lightsOn = new OnCommand(livingRoom);
		lightsOn.execute();
		
		Command lightsOff = new OffCommand(kitchenLight);
		lightsOff.execute();
	}
}
