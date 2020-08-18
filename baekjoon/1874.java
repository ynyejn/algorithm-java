package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//테스트 케이스 입력받기
		int t = Integer.parseInt(br.readLine());
		int arr[] = new int[t];
		//스택만들기
		Stack<Integer> stack = new Stack<Integer>();
	
		//배열에 원하는 순서대로 입력받음
		for(int i=0; i<t; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		//1부터 오름차순으로 비교할 count변수
		int count=0;
		
		for(int x : arr) {
			if(x>count) { //count 가 0부터 시작하기때문에 무조건 여기탐
				while(x>count) { //따라서 x==넣을 숫자 일때까지 여기탐
				stack.push(++count);
				sb.append("+\n");
				}
				stack.pop(); //peak가 x와 같은거니까 하나뺌
				sb.append("-\n");
			}else { //count보다 배열의 해당 수 가 작을 때
				if(stack.peek()!=x) {
				System.out.println("NO");
				return;
				}
				stack.pop();
				sb.append("-\n");
			}
		}
		System.out.println(sb);
	}
}

