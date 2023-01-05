package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nx2타일링 {

//	public static int combination(int n, int r) {
//		if(n == r || r == 0) 
//			return 1; 
//		else 
//			return combination(n - 1, r - 1) + combination(n - 1, r); 
//	}
//	
//	public static int dynamic(Integer[] dp, int n) { //10000이상 넘어가면 오류남 
//		if(dp[n]==null) {
//			
//			dp[n]=dynamic(dp,n-1) + dynamic(dp,n-2);
//		}
//		
//		return dp[n]%10007;
//	}
	
	public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(bf.readLine());
//	int count = n/2+1;
//	int sum = 0;
	int sum=0;
	int sum1=1;
	int sum2=2;
	if(n==2) {
		sum=2;
	}else if(n==1) {
		sum=1;
	}
	for(int i=3;i<=n;i++) {
		sum = sum1 + sum2;
		sum1=sum2%10007;
		sum2=sum%10007;
		sum=sum%10007;
	}
	System.out.print(sum);
	
	}

}