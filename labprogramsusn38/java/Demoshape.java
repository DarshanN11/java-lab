package labprogramsusn38.java;
class Circle implements Shape{
	public void draw()
	{
		System.out.println("Circle.draw()...");
	}
	public void erase()
	{
		System.out.println("Circle.erase()...");
	}
}
class Triangle implements Shape{
	public void draw()
	{
		System.out.println("Triangle.draw()...");
	}
	public void erase()
	{
		System.out.println("Triangle.erase()...");
	}
}
class Square implements Shape{
	public void draw()
	{
		System.out.println("Square.draw()...");
	}
	public void erase()
	{
		System.out.println("Square.erase()...");
	}
}
interface Shape{
	public void draw();
	public void erase();
}
public class Demoshape {

	public static void main(String[] args) {
		Shape Shape;
		Shape=new Circle();
		Shape.draw();
		Shape.erase();
		
		Shape=new Triangle();
		Shape.draw();
		Shape.erase();
		
		Shape=new Square();
		Shape.draw();
		Shape.erase();

	}

}
