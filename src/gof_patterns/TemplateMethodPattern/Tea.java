package TemplateMethodPattern;

public class Tea extends Beverages{

	public void addCondiments(){
		System.out.println("adding lemon");
	}

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steeping the tea");
		
	}
	
	
}
