package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			bw.write(a*b/gcd(a,b)+"\n");
		}
		bw.flush();
		bw.close();
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
