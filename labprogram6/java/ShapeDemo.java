package labprogram6.java;

import java.util.Scanner;

abstract class Shape{
	public abstract float caluclateArea();
	public abstract float caluclatePerimeter();
}
class Circle extends Shape{
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	@Override
	public float caluclatePerimeter() {
		return(float)(2*Math.PI*radius);
	}
	
	@Override
	public float caluclateArea() {
		return(float)(Math.PI*radius*radius);
	}
}
class Triangle extends Shape{
	private int a;
	private int b;
	private int c;
	
	public Triangle(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public float caluclatePerimeter() {
		return(float) (a+b+c);
	}
	@Override
	public float caluclateArea() {
		float s=(float) (a+b+c/2.0);
		float area =(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
}
public class ShapeDemo {

	public static void main(String[] args) {
		int option=0;
		int radius;
		int a;
		int b;
		int c;
		float perimeter;
		float area;
		
		Scanner Scanner=new Scanner(System.in);
		System.out.println("1.Circle");
		System.out.println("2.Triangle");
		System.out.println("Enter your option:");
		option=Scanner.nextInt();
		
		Shape Shape;
		switch(option)
		{
		case 1:
			System.out.println("Enter radius: ");
			radius=Scanner.nextInt();
			Shape=new Circle(radius);
			perimeter=Shape.caluclatePerimeter();
			area=Shape.caluclateArea();
			System.out.println("Perimeter: "+perimeter);
			System.out.println("Area: "+area);
			break;
			
		case 2:
			System.out.println("Enter 3 sides of a Triangle: ");
			a=Scanner.nextInt();
			b=Scanner.nextInt();
			c=Scanner.nextInt();
			Shape=new Triangle(a,b,c);
			perimeter=Shape.caluclatePerimeter();
			area=Shape.caluclateArea();
			System.out.println("Perimeter: "+perimeter);
			System.out.println("Area: "+area);
			break;
		}

	}

}

