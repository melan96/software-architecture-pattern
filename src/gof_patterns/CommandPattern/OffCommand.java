package gof_patterns.CommandPattern;

public class OffCommand implements Command {

	
	Light light;
	

	
	public OffCommand(Light kitchenLight) {
		// TODO Auto-generated constructor stub
		this.light = kitchenLight;
	}

	public void execute() {
		// TODO Auto-generated method stub
		this.light.lightOff();
	}

}
