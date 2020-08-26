package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int stack[] = new int[10000];
	static int index = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String[] str = br.readLine().split(" ");
			switch (str[0]) {
			case "push":
				push(str[1]);
				break;
			case "pop":
				bw.write(pop() + "\n");
				break;
			case "size":
				bw.write(size() + "\n");
				break;
			case "empty":
				bw.write(empty() + "\n");
				break;
			case "top":
				bw.write(top() + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();

	}

	private static int top() {
		if (index == 0) {
			return -1;
		} else {
			return stack[index - 1];
		}
	}

	private static int empty() {
		if (index == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	private static int size() {
		return index;
	}

	private static void push(String str) {
		int a = Integer.parseInt(str);
		stack[index++] = a;
	}

	private static int pop() {
		if (index == 0) {
			return -1;
		} else {
			int a = stack[index-1];
			stack[index-1] = 0;
			index--;
			return a;
		}
	}
}
