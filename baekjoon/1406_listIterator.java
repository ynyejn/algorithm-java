package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		LinkedList<Character> list = new LinkedList<Character>();
		ListIterator<Character> idx = list.listIterator(list.size());
		for (int i = 0; i < str.length(); i++) {
			idx.add(str.charAt(i));
			// ListIterator를 통해 값을 넣어주어 커서가 맨뒤로 가있게 된다.
		}

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String cmd = br.readLine();
			try {
				if (cmd.equals("L")) {
					idx.previous();
				} else if (cmd.equals("D")) {
					idx.next();
				} else if (cmd.equals("B")) {
					idx.previous();
					idx.remove();
				} else {
					idx.add(cmd.charAt(2));
				}
			} catch (Exception e) {}
		}
		for (char ch : list) {
			bw.write(ch);
		}
		bw.flush();
		bw.close();

	}
}
