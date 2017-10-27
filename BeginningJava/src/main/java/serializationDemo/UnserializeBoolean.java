package serializationDemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UnserializeBoolean {
	UnserializeBoolean() {
		Boolean booleanData = null;
		try {
			FileInputStream fis = new FileInputStream("boolean.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			booleanData = (Boolean) ois.readObject();
			ois.close();
			// continued...20

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Unserialized Boolean from " + "boolean.ser");
		System.out.println("Boolean data: " + booleanData);
		System.out.println("Compare data with true: " + booleanData.equals(new Boolean("true")));
	}
	// continued...21

	public static void main(String args[]) {
		UnserializeBoolean usb = new UnserializeBoolean();
	}
	}
