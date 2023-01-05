package javaver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 큐 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(bf.readLine());
		
		Queue<Integer> que1 = new LinkedList<Integer>();
		String push = null;
		for(int i=0; i<count; i++) {		
			String str = bf.readLine();
			if(str.equals("pop")) {
				if(!que1.isEmpty()) {
				System.out.println(que1.poll());
				} else {
					System.out.println("-1");
				}
			} else if(str.equals("front")) {
				if(!que1.isEmpty()) {
				System.out.println(que1.peek());
				} else {
					System.out.println("-1");
				}
			} else if(str.equals("back")) {
				if(!que1.isEmpty()) {
					System.out.println(push);
				} else {
					System.out.println("-1");
				}
			} else if(str.equals("size")) {
					System.out.println(que1.size());
			} else if(str.equals("empty")) {
				if(!que1.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println("1");
				}
			} else if(str.charAt(0)=='p'/*push X*/) {
				que1.offer(Integer.parseInt(str.split(" ")[1]));
				push =str.split(" ")[1];
			}
		}
	}

}
