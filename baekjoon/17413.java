package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		boolean check = false;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<str.length();i++) {
			char a = str.charAt(i);
			if(check==false) {
				if(a==' '||a=='<') {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(a);
					if(a=='<')
					check=true;	
				}else {
					stack.add(a);
					if(i==str.length()-1) {
						while(!stack.isEmpty()) {
							sb.append(stack.pop());
						}
					}
				}
			}else {
				sb.append(a);
				if(a=='>')
					check=false;
			}
			
		}
		
	System.out.println(sb.toString());
	}
}
