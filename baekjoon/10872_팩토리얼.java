package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum=1;
		if(n==0) { //0!=1이다
			sum=1;
		}else {
			for(int i=1;i<=n;i++) {
				sum*=i;
			}
		}
		
		System.out.println(sum);
	}
}
