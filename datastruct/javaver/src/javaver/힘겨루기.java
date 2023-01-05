package javaver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 힘겨루기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(bf.readLine());
		String str = bf.readLine();
		int arr;
		int maax=0;
		int check=-1;
		int check2=-1;
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer stk = new StringTokenizer(str);

		for(int i=0; i<count; i++) {
			arr= Integer.parseInt(stk.nextToken());
			if(maax<arr) {
				maax = arr;
				check=i;
				check2=-1;
			} else if(maax==arr) {
				check2=i;
			}
		}
		if(check2==-1) {
		if(count-check-1 > check) {
		sb.append("R").append('\n');
		} else {
			sb.append("B").append('\n');
		}
		} else if(check2<count-check-1) {
			sb.append("R").append('\n');
		} else if(check2>count-check-1){
			sb.append("B").append('\n');
		} else {
			sb.append("X").append('\n');
		}
		System.out.println(sb.toString());	
		
}
}
