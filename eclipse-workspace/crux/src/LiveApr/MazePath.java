package LiveApr;

import java.util.Scanner;

public class MazePath {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// int m = sc.nextInt();
		printansm1(1, 1, n, n, "");
		System.out.println();
		System.out.println(count);
		System.out.println();

	}

	public static void printansm(int i, int j, int n, int m, String string) {
		// TODO Auto-generated method stub
		if (i == n && j == m) {
			System.out.print(string + " ");
			count++;
			return;
		}
		if (i > n || j > m) {
			return;
		}
		printansm(i + 1, j, n, m, string + "V");
		printansm(i, j + 1, n, m, string + "H");
		printansm(i + 1, j + 1, n, m, string + "D");
	}

	public static void printansm1(int i, int j, int n, int m, String string) {
		// TODO Auto-generated method stub
		if (i == n && j == m) {
			System.out.print(string + " ");
			count++;
			return;
		}
		if (i > n || j > m) {
			return;
		}
		printansm1(i + 1, j, n, m, string + "V");
		printansm1(i, j + 1, n, m, string + "H");
		if (isDiagonal(i, j, n)) {
			printansm1(i + 1, j + 1, n, m, string + "D");
		}
	}

	public static boolean isDiagonal(int cr, int cc, int N) {

		if (cr == cc || cr + cc == N + 1) {
			return true;
		}

		else {
			return false;
		}
	}
}
