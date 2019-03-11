package gof_patterns.CommandPattern;

public class OnCommand implements Command {

	Light light;
	
	public OnCommand(Light dsfasdf) {
		this.light = dsfasdf;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.lightOn();
	}

}
