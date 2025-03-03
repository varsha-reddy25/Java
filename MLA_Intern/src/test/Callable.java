package test;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class RunnableImple implements Runnable{
	public void run() {
		System.out.println("run() from a different thread main");
	}
}
public class Callable {
	static ExecutorService executor=Executors.newFixedThreadPool(2);
public static void main(String[] args) {
	RunnableImple task = new RunnableImple();
	Thread t1=new Thread(task);
	t1.start();
	executor.submit(task);
	executor.shutdown();
}
}
