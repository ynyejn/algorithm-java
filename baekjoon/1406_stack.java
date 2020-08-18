package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		String str = br.readLine();
		for(int i=0;i<str.length();i++) {
			left.push(str.charAt(i));
		}
		
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String m = br.readLine();
			if(m.equals("L")&&!left.isEmpty()) {
				right.push(left.peek());
				left.pop();
			}else if(m.equals("D")&&!right.isEmpty()) {
				left.push(right.peek());
				right.pop();
			}else if(m.equals("B")&&!left.isEmpty()) {
				left.pop();
			}else if(m.charAt(0)=='P'){
				left.push(m.charAt(m.length()-1));
			}
		}
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		while(!right.isEmpty()) {
			bw.write(right.pop());
		}
		bw.flush();
		bw.close();
	}
}
