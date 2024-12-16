package labprogram12.java;
class MyThread extends Thread{
	public MyThread(String name) {
	super(name);
	start();
}
@Override
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println(getName()+"-child thread running"+i);
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println(getName()+" was interrupted");
		}
	}
	System.out.println(getName()+"-child thread completed");
}
}
public class MainClass {
	public static void main(String[] args) {
		MyThread childThread=new MyThread("childThread");
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"-Main thread running"+i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println("Main thread was interrupted");	
			}						
		}
		System.out.println("Main thread completed");

	}
}


