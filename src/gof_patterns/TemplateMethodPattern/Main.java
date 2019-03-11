package TemplateMethodPattern;

public class Main {

	static Beverages beverage = null;
	public static void main(String[] args){
		Beverages tea = new Tea();
		tea.make();
	}
}
