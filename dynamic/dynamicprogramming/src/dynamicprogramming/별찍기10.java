package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기10 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		boolean[][] dp = new boolean[N][N];
		dp[1][1]=true;
		int k =3;
		
		
		for(;k<N;k*=3) {
			
			for(int i=1;i<N;i+=k) {
				for(int j=1;j<N;j+=k) {
					dp[i][j]=true;
					
				}
			}

			for(int m=0;m<N;m+=(k*3)) {

				for(int n=0;n<N;n+=(k*3)) {
					
			for(int i=0;i<k;i++) {
				for(int j=0;j<k;j++) {

					dp[k+i+m][k+j+n]=true;
				}
			}
				}
			}
		}
			
			
		for(int i=0;i<N;i++) {
			for(int j=0; j<N;j++) {
			
				if(dp[i][j]==false)
					sb.append('*');
			 else 
				sb.append(' ');
			
			}
			sb.append('\n');
		
		}
		System.out.println(sb);
		
	}

}