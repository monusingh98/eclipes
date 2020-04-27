package LiveApr;

import java.util.*;

public class Merge_K_sorted_Arrays {
	static class Node {
		long data;
		int listNo;

		public Node(long data, int k) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.listNo = k;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Node> MinHeap = new PriorityQueue<>();
		int k = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<ArrayList<Node>> arr = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			ArrayList<Node> a = new ArrayList<>();
			for (int j = 0; j < n; j++)
				a.add(new Node(sc.nextLong(), i));
			arr.add(a);

		}
		for (int i = 0; i < k; i++) {
			Node nn = arr.get(i).get(0);
			MinHeap.add(nn);
			arr.get(i).remove(0);
		}
		int i = 0;
		long ans[] = new long[n * k];
		while (!MinHeap.isEmpty()) {
			Node a = MinHeap.poll();
			ans[i++] = a.data;
			int idx = a.listNo;
			if (arr.get(idx).size() != 0) {
				MinHeap.add(arr.get(idx).get(0));
				arr.get(i).remove(0);
			}
		}
		for(long val : ans) {
			System.out.print(val+" ");
		}
		System.out.println();
		

	}
}