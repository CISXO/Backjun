package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//이 방식은 재귀방식이기 때문에 시간 초과가 난다 
public class 더하기123no5 {
	static int count = 0;
	static void dynamic(int check,int num) {
		if(num>0) {
		if(check==0) {		
		dynamic(1,num-1);
		dynamic(2,num-2);
		dynamic(3,num-3);
			
		}else if(check==3) {
			dynamic(1,num-1);
			dynamic(2,num-2);
		}else if(check==2) {
			dynamic(1,num-1);
			dynamic(3,num-3);
		}else if(check==1) {
			dynamic(2,num-2);
			dynamic(3,num-3);
		}
		
		} else if(num==0) {
			count++;
			count=count%1000000009;
		} else {
			return;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int num;
		for(int i=0; i<a; i++) {
			num=Integer.parseInt(bf.readLine());
		dynamic(0,num);
		
		System.out.println(count);
		count=0;
		}
		
	}
}
