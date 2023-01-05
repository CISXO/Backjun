package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 프로그래머스2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(bf.readLine());
		int check=1;
		int sum, number;
		sum=0;
		for(int i=1;sum<k;i++) {
			sum+=i;
			check=i;
		}
		
		System.out.println(check-(sum-k));
	}

}
