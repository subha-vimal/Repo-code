package pom.org;

public class Shop implements Interface3{
	
	public void box() {
	System.out.println("Black box");
	}

    public void pen() {
	System.out.println("Black pen");
	}

    public void book() {
	System.out.println("notebook");	
	System.out.println("notebook");
	System.out.println("notebook");
	System.out.println("notebook");
}

	public static void main(String[] args) {
		Shop s = new Shop();
		s.book();
		s.box();
		s.pen();
		s.colour();
		
	}

	@Override
	public void colour() {
		System.out.println("red");
		System.out.println("red");
		System.out.println("red");
		System.out.println("red");
		}

		

}
