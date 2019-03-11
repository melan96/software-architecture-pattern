package abstract_factory;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");

		for(int i=0;i<10;i++) {
			System.out.print("*");
			if(i==9) {
				System.out.println("");
			}
		}
		
		for(int i=0;i<6;i++) {
			System.out.print("*");
			for(int v=0;v<8;v++) {
				System.out.print(" ");
				if(v==7) {
					System.out.println("*");
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print("*");
		}
	}

}
