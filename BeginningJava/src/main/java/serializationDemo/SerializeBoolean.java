package serializationDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeBoolean {
	SerializeBoolean() {
		Boolean booleanData = new Boolean("true");
		try {
			FileOutputStream fos = new FileOutputStream("boolean.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(booleanData);
			oos.close();
			// continued...16

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String args[]) {
		SerializeBoolean sb = new SerializeBoolean();
	}
}
