package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기123 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] a = new int[n];

		int res,sum,sum1,sum2;
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(bf.readLine());
			sum=1;
			sum1=2;
			sum2=4;
			res=0;
			for(int j=4;j<=a[i];j++) {
				res=sum+sum1+sum2;
				sum=sum1;
				sum1=sum2;
				sum2=res;
			}
			if(a[i]==3) {
				res = 4;
			} else if(a[i]==2) {
				res = 2;
			} else if(a[i]==1) {
				res = 1;
			}
			System.out.println(res);
		}
//		for(int i=0; i<n; i++) {
//			a=Integer.parseInt(bf.readLine());
//			if(a==1) {
//				System.out.println("1");
//			} else if(a==2){
//				System.out.println("2");
//			}else if(a==3){
//				System.out.println("4");
//			}else if(a==4){
//				System.out.println("7");
//			}else if(a==5){
//				System.out.println("13");
//			}else if(a==6){
//				System.out.println("24");
//			}else if(a==7){
//				System.out.println("44");
//			}else if(a==8){
//				System.out.println("81");
//			}else if(a==9){
//				System.out.println("149");
//			}else if(a==10){
//				System.out.println("274");
//			}
//		}
		
	}
	
	}

