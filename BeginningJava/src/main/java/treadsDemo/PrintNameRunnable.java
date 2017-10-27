package treadsDemo;

public class PrintNameRunnable implements Runnable {
	private String name;

	PrintNameRunnable(String name) {
		this.name = name;
	}

	// Implementation of the run() defined in the
	// Runnable interface.
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(name);
		}
	}
}
