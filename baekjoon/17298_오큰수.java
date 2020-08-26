package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int arr[] = new int[t];
		int arr2[] = new int[t];
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		for(int i=0;i<t;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<arr.length;i++) {
			if(i==0) {
				stack.add(i);
			}else {
				while(!stack.isEmpty()&&arr[i]>arr[stack.peek()]) {
					arr2[stack.peek()]=arr[i];
					stack.pop();
				}
				stack.add(i);
			}
		}
		while(!stack.isEmpty()) {
			arr2[stack.pop()]=-1;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr2.length-1;i++) {
			sb.append(arr2[i]+" ");
		}
		sb.append(arr2[arr2.length-1]);
		System.out.println(sb);
	}
}
