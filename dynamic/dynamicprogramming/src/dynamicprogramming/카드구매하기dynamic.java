package dynamicprogramming;

import java.util.Scanner;

public class 카드구매하기dynamic {

	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt(); // 카드 개수
		    int[] prices = new int[n+1]; // 카드팩 가격
		    prices[0] = 0; // 카드가 0개 들어있는 카드팩은 0원
		    for (int i = 1; i <= n; i++) {
		      prices[i] = sc.nextInt();
		    }
		    
		    int[] dp = new int[n+1]; // i개의 카드를 가지기 위해 지불해야 하는 최댓값
		    for (int i = 1; i <= n; i++) {
		      for (int j = 1; j <= i; j++) {
		        dp[i] = Math.max(dp[i], dp[i-j] + prices[j]);
		      }
		    }
		    System.out.println(dp[n]);
		  }

}
