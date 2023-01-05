package javaver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 덱 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Num = Integer.parseInt(br.readLine());
		
		String str,check;
		StringBuilder sb;
		Deque<Integer> deq = new LinkedList<Integer>();
		for(int i=0; i<Num; i++) {
			sb = new StringBuilder();
			str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			check = st.nextToken();
			
			if(check.equals("push_front")) {
				deq.offerFirst(Integer.parseInt(st.nextToken()));
				continue;
			} else if(check.equals("push_back")) {
				deq.offerLast(Integer.parseInt(st.nextToken()));
				continue;
			} else if(check.equals("pop_front")) {
				if(!deq.isEmpty()) {
				sb.append(deq.remove());
				} else {
				sb.append("-1");
				}
			} else if(check.equals("pop_back")) {
				if(!deq.isEmpty()) {
					sb.append(deq.removeLast());				
				} else {
				sb.append("-1");
				}
			} else if(check.equals("size")) {
				sb.append(deq.size());
			} else if(check.equals("empty")) {
				if(!deq.isEmpty()) {
					sb.append("0");		
				}else {
					sb.append("1");
				}
			} else if(check.equals("front")) {
				if(!deq.isEmpty()) {
					sb.append(deq.peek());
				} else {
					sb.append("-1");
				}
			} else if(check.equals("back")) {
				if(!deq.isEmpty()) {
					sb.append(deq.peekLast());
				} else {
					sb.append("-1");
				}
			}
			System.out.println(sb.toString());
		}
		
	}

}
