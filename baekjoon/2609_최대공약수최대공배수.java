package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		//최대공약수
		int gcd = gcd(a,b);
		System.out.println(gcd);
		//최소공배수
		System.out.println(a*b/gcd);
	}
	private static int gcd(int a, int b) {
		//재귀함수사용
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
}
