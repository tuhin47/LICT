package treadsDemo;

public class ExtendThreadClassTest1 {
	public static void main(String args[]) {
		PrintNameThread pnt1 = new PrintNameThread("A");
		pnt1.start(); // Start the first thread
		PrintNameThread pnt2 = new PrintNameThread("B");
		pnt2.start(); // Start the second thread

	}
}
