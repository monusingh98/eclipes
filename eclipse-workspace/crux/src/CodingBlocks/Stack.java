package CodingBlocks;

public class Stack {
	private int data[];
	private int tos;

	public Stack() {
		this.data = new int[5];
		tos = -1;

	}

	public Stack(int cap) {
		this.data = new int[cap];
		tos = -1;
	}

	public boolean isfull() {
		return this.size() == this.data.length;

	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Stack is full");
		}
		this.tos++;
		data[tos] = item;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int item = data[tos];
		data[tos] = 0;
		tos--;
		return item;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");

		}
		return this.data[tos];
	}

	public void display() {
		int i =tos;
		while (i >= 0) {
			System.out.println(data[i]);
			i--;
		}

	}

}
