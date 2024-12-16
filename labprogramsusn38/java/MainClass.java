package labprogramsusn38.java;

class MyRunnable implements Runnable{
	private String threadName;
	public MyRunnable(String name) {
		this.threadName=name;
	}
	@Override
	public void run() {
		try {
			System.out.println(threadName+"is running");
			Thread.sleep(500);
			System.out.println(threadName+"has resumed after sleeping for 500ms");
		}catch(InterruptedException e) {
			System.out.println(threadName+"was interuppted");
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		MyRunnable runnable1=new MyRunnable("Thread1");
		MyRunnable runnable2=new MyRunnable("Thread2");
		
		Thread thread1=new Thread(runnable1);
		Thread thread2=new Thread(runnable2);
		
		thread1.start();
		thread2.start();


	}

}
