public class App {
	public static void main(String[] args) {
		int intValue = 888;
		short shortValue = 55;
		byte byteValue = 20;
		long longValue = 233333;
		float floatValue = 3452.46f;
		float floatValue2 = (float)156.456;
		double doubleValue = 23.643;

		System.out.println(Byte.MAX_VALUE);

		intValue = (int) longValue;
		System.out.println(intValue);

		doubleValue = intValue;
		System.out.println(doubleValue);

		intValue = (int) floatValue;
		System.out.println(intValue);
		
		//Wont work as we expect it to!
		//128 is too big for a byte
		byteValue = (byte)128;
		System.out.println(byteValue);
		

	}
}
