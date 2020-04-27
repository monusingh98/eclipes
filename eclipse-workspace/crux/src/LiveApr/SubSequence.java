package LiveApr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubSequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while (t-- > 0) {
		String str = sc.next();
		ArrayList<String> mr = printanser(str);
		// Collections.sort(mr);
//		for (String val : mr) {
//			System.out.print(val + " ");
//		}
//		System.out.println();
		subSequnec(str, "");
		System.out.println();
		System.out.println(mr.size());
		// }

	}

	public static ArrayList<String> printanser(String str) {

		if (str.length() == 0) {

			ArrayList<String> bs = new ArrayList<>();
			bs.add("");
			return bs;
		}
		char ch = str.charAt(0);
		String roq = str.substring(1);
		ArrayList<String> rr = printanser(roq);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {

			mr.add(val);
			mr.add (val+ch);

		}
		return mr;

	}

	public static void subSequnec(String str, String ans) {
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		subSequnec(str.substring(1), ans);
		subSequnec(str.substring(1), ans + str.charAt(0));

	}
}
