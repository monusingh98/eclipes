package LiveApr;

import java.util.*;

public class KthRoot {
	public static void main(String args[]) {
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			int k = sc.nextInt();
			 System.out.println((int) (Math.pow(n, (float) (1.0 / k))));
			System.out.println(kthroot(n, k));
		}
	}

	public static long kthroot(long n, int k) {
		if (k == 1) {
			return n;
		}
		long left = 1;
		long right = 100000;
		
		while (left < right) {
			long mid = (left + right+1) / 2;
			long ans = 1;
			boolean f = false;
			for (int i = 1; i <= k; i++) {
				ans *= mid;
				if (ans > n) {
					f = true;
					break;
				}
			}
			if (f) {
				right = mid-1;
			} else {
				left = mid;
			}
			//System.out.println(right);

		}
		return right;
	}
}
