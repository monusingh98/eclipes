package LiveApr;

public class lec3 {
	public static void main(String[] args) {
		byte b = (byte) 129;
//		byte b1 = 9;
//		short sh = b1;
//		b1 = (byte) sh;
//		float f = (float) 3.0;
//		char ch = (char) 69000;
//		System.out.println(f);
//		System.out.println(ch);
//		System.out.println(gcd(32, 10));
		System.out.println(pow(2, 6));
	}

	public static int gcd(int a, int b) {
		while (a % b != 0) {
			int rem = a % b;
			a = b;
			b = rem;
		}
		return b;
	}

	public static int pow(int a, int b) {
		if (b == 1) {
			return a;
		}
		int res = pow(a, b / 2);
		if ((b & 1) != 0) {
			return a * (res * res);
		} else {

			return res * res;
		}
	}

}
