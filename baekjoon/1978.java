package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String num[]=br.readLine().split(" ");
		int count=0;
		for(String str : num) {
			if(test(Integer.parseInt(str)))
				count++;
			
		}
		System.out.println(count);
	}

	private static boolean test(int num) {
		if(num<2) {
			return false;
		}else {
			for(int i=2; i*i<=num; i++) {
				if(num%i==0) {
					return false;
				}
			}
		}
		//위 둘다 안타면 소수임.
		return true;
	}
}
