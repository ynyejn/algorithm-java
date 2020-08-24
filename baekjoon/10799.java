package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum=0;
		int stack=0;
		for(int i=0;i<str.length();i++) {
			char a = str.charAt(i);
			if(a=='(') {
				stack++;
			}else {
				if(str.charAt(i-1)=='(') {
					stack--;
					sum+=stack;
				}else {
					stack--;
					sum+=1;
				}
			}
		}
		
	System.out.println(sum);
	}
}
