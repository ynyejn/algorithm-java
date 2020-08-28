package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean check[] = new boolean[1000001];
		ArrayList<Integer> list = new ArrayList<Integer>();
		//소수 골라놓기..false면 소수
		check[0]=check[1]=true;
		for(int i=2;i+i<=1000000;i++) {
			if(!check[i]) {
				list.add(i);
				for(int j=i+i;j<=1000000;j+=i) {
					check[j]=true;
				}
			}
		}
		
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) {
				break;
			}
			int a=-1;
			for(int i=0;i<list.size();i++) {
					a=list.get(i);
					if(!check[n-a]) {
						sb.append(n+" = "+a+" + "+(n-a)+"\n");
						break;
					}				
				}
		
		}
		System.out.println(sb.toString());
	}
}
