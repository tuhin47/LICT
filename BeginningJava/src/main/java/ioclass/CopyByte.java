package ioclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByte {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("in.txt");
			out = new FileOutputStream("out.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("tada");
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}