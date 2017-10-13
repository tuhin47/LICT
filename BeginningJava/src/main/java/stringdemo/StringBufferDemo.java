package stringdemo;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Jonathan");
		char charArr[]= "Hi XX".toCharArray();
		System.err.println(charArr);
		sb.getChars(0, 2, charArr, 3);
		System.out.println("get:");
		System.out.println(charArr);
	}

}
