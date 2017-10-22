package treadsDemo;

public class RunnableThreadTest1 {
	public static void main(String args[]) {
		PrintNameRunnable pnt1 = new PrintNameRunnable("A");
		Thread t1 = new Thread(pnt1);
		t1.start();
	}
}
