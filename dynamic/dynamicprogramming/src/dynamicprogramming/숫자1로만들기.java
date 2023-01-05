package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자1로만들기 {
	
	static int dynamic(Integer dp[],int num) {
		if(dp[num]==null) {
			if(num%6==0) {
			dp[num] = Math.min(dynamic(dp,num-1),Math.min(dynamic(dp,num/3),dynamic(dp,num/2)))+1;
		} else if(num%3==0) {
			dp[num]= Math.min(dynamic(dp,num/3), dynamic(dp,num-1))+1;
		} else if(num%2==0) {

			dp[num]= Math.min(dynamic(dp,num/2), dynamic(dp,num-1))+1;
		} else {
			dp[num]=dynamic(dp,num-1)+1;
		}
			
		}
		
		return dp[num];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());

		
		Integer dp[] =new Integer[num+1];
		dp[0]=0;
		dp[1]=0;
		System.out.println(dynamic(dp, num));
		
	}
}

