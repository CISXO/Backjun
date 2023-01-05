package javaver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 에디터_스택 {

	public static void main(String[] args) throws IOException {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String str = sc.readLine();
		
		int count = Integer.parseInt(sc.readLine());;
		
		Stack<Object> stack1 = new Stack<>();
		Stack<Object> stack2 = new Stack<>();
		 
		for (int i = 0; i < str.length(); i++) {
			stack1.push(str.charAt(i));
		}

		
       for(int i=0; i<count; i++) {
        	String arr = sc.readLine();
			if(arr.equals("L")) {
				if (!stack1.empty())
				stack2.push(stack1.pop());
			} else if(arr.equals("D")) {
				if (!stack2.empty())
				stack1.push(stack2.pop());
			} else if(arr.equals("B")) {
				if (!stack1.empty())
				stack1.pop();
			} else if(arr.charAt(0)=='P'){
				stack1.push(arr.charAt(2));
			}
        }
       
       while (!stack1.empty()) {
			stack2.push(stack1.pop());
		}
       StringBuilder sb = new StringBuilder();
		while (!stack2.empty()) {
			sb.append(stack2.pop());
		}
		System.out.println(sb.toString());
		//위와 아래 차이 정리해서 올리기 아래걸로 하면 시간초과남
//        while (!stack1.empty()) {
//			stack2.push(stack1.pop());
//		}
//
//		while (!stack2.empty()) {
//			System.out.print(stack2.pop());
//		}
	}

}
