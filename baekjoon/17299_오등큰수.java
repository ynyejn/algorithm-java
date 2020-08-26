package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int arr[] = new int[t];
		int arr2[] = new int[t];
		int count[] = new int[1000001];// 등장횟수배열
		

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			count[arr[i]]++;
		}

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (i==0) {
				stack.push(i);
			} else {
				while (!stack.isEmpty()&&count[arr[i]] > count[arr[stack.peek()]]) {
					arr2[stack.pop()]=arr[i];	
				}
				stack.push(i);
			}
		}
		while(!stack.isEmpty()) {
			arr2[stack.pop()]=-1;
		}
		StringBuilder sb = new StringBuilder();
		for (int a: arr2) {
			sb.append(a + " ");
		}
		System.out.println(sb);
	}
}
