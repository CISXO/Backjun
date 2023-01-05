package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카드구매하기 {
	public static int max2(float f[]) {
		float max=f[0];
		int r = 0;
		for(int i=1; i<f.length;i++) {
			if(max<f[i]) {
				max = f[i];
				r=i;
			}
		}
		return r;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		String str = bf.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int p[] = new int[N];
		float f[] = new float[N];
		int sum = 0;
		for(int i=0; i<N; i++) {
			p[i]=Integer.parseInt(st.nextToken());
			f[i]= (float)p[i]/(i+1);
		}
		int max =0;

		while(N!=0) {
			max = max2(f);
		if(N-max+1>0) {

			sum = sum + p[max];
			N= N - (max + 1);
		} else 	{
			
			f[max]=0;
		}
		
		}
		
		System.out.println(sum);
		
	}

}


