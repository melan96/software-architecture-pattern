package gof_patterns.TemplateMethodPattern;

public abstract class Beverages {

	abstract void addCondiments();
	
	abstract void brew();
	
	public void pour(){
		
		System.out.println("Pour");
	}
	
	public void boilWater(){
		System.out.println("Boil water");
	}
	
	public void make(){
		
		boilWater();
		
		brew();
		
		addCondiments();
		
		pour(); 
		
		
		
	}
}
