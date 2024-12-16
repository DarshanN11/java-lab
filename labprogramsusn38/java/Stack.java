package labprogramsusn38.java;
import java.util.Scanner;

public class Stack {
	static final int SIZE=5;
	static int top=-1;
	static int Array[]=new int[SIZE];
	public static void main(String[] args) {
		int choice;
		Scanner Scanner=new Scanner(System.in);
		while(true)
		{
			System.out.println(" ");
			System.out.println("perform operations on stack");
			System.out.println("1,push");
			System.out.println("2,pop");
			System.out.println("3,display");
			System.out.println("4,end");
			System.out.println("enter the choice");
			choice=Scanner.nextInt();
			switch(choice)
			{
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				System.exit(0);
				default:
					System.out.println("invalid choice");
			}
		}

	}
	static void push()
	{
		int x;
		Scanner Scanner =new Scanner(System.in);
		if(top==SIZE-1)
		{
			System.out.println("overflow");
	}
		else
		{
			System.out.println("elements to be added to stack");
			x=Scanner.nextInt();
			top= top+1;
			Array[top]=x;
		}
	}
	static void pop()
	{
		if(top==-1)
		{
			System.out.println("underflow");
		}
		else
		{
			System.out.println("poped element"+Array[top]);
			top=top-1;
		}
	}
	static void display()
	{
		if(top==-1)
		{
			System.out.println("underflow");
		}
		else
		{
			System.out.println("elements present in the stack");
			for(int i=top;i>=0;--i)
				System.out.println(Array[i]);
			
		}
		}
	}
