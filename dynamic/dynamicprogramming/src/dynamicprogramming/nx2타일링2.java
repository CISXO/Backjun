package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nx2타일링2 {


	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int sum = 1;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum = sum*2+1;
				sum=sum%10007;
			} else {
				sum = sum*2-1;
				sum=sum%10007;
			}
		}
		System.out.print(sum);
		
		
	}

}
						