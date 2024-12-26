package exceptionPackage;

public class MyThreadnew implements Runnable {
	 
	public void run() {
		System.out.println("Thread runing in" + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		MyThreadnew m1= new MyThreadnew();
		for(int i=0;i<5;i++) {
		Thread thread=new Thread(m1);
		
		thread.start();
	}
	}
}
