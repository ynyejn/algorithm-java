package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a,b;
		a=Integer.parseInt(st.nextToken());
		b=Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i=1;i<=a;i++) 
			list.add(i);
		int idx = b-1;
		while(list.size()!=1) {
			sb.append(list.get(idx)+", ");
			list.remove(idx);
			idx+=b-1;
			if(idx>=list.size()) 
				idx=idx%list.size();
		}
	sb.append(list.get(0)+">");
	System.out.println(sb.toString());
	}
}
