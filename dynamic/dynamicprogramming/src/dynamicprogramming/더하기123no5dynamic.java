package dynamicprogramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 더하기123no5dynamic {

	static long[][] dp = new long[100001][4];

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		dp[1][1] = 1;
		dp[1][2] = 0;
		dp[1][3] = 0;
		dp[2][1] = 0;
		dp[2][2] = 1;
		dp[2][3] = 0;
		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;
	
		for (int i = 4; i <= 100000; i++) {
			dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % 1000000009;
			dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % 1000000009;
			dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % 1000000009;
		}
		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			long res = (dp[n][1] + dp[n][2] + dp[n][3]) % 1000000009;
			bw.write(res + "\n");
		}

		bw.flush();
	}
}
