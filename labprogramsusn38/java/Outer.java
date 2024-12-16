package labprogramsusn38.java;
public class Outer {
	int x;
	void display() {
		System.out.println("outer class display x: "+x);
		Inner inner=new Inner();
		inner.x=100;
		inner.display();
	}
	class Inner{
		int x;
		void display() {
			System.out.println("In Inner display x: "+x);
		}
	}
	public static void main(String[] args) {
		Outer out=new Outer();
		out.x=200;
		out.display();
	}
}