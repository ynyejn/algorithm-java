package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = (n/5);
		if(n>=25) {
			sum+=(n/25);
		}
		if(n>=125) {
			sum+=(n/125);
		}
		
		System.out.println(sum);
	}
}
