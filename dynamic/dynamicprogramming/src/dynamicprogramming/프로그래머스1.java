package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 프로그래머스1 {
	 static int insertion_sort(int list[]) {
		 int i, j, key;

		  // 인텍스 0은 이미 정렬된 것으로 볼 수 있다.
		  for(i=1; i<list.length; i++){
		    key = list[i]; 
		    for(j=i-1; j>=0 && list[j]>key; j--){
		      list[j+1] = list[j];
		    }

		    list[j+1] = key;
		  }
		  
		 int a= list.length/2;
		 
		 return list[a];
}

	public static void main(String[] args) {
		int[] list1,list2;
		int N=5;
		int answer = 0;
		list1 = new int[N];
		list2 = new int[N];
		
		int [] b = new int[N];
		int [] c = new int[N];
		int[][] matrix= {{1, 19, 20, 8, 25},{21, 4, 3, 17, 24},{12, 5, 6, 16, 15},{11, 18, 10, 9, 23},{7, 13, 14, 22, 2}};
		
//		ArrayList<String> matrix1= new ArrayList<>(Arrays.asList(""));
		for(int j=0; j<N; j++) {
			
		for(int i=0; i<N; i++) {
		list1[i]=matrix[j][i];
		list2[i]=matrix[i][j];
		}
		b[j]= insertion_sort(list1);
		c[j]= insertion_sort(list2);
		}

		System.out.println(b[0]+"|"+b[1]+"|"+b[2]+"|"+b[3]+"|"+b[4]);

		System.out.println(c[0]+"|"+c[1]+"|"+c[2]+"|"+c[3]+"|"+c[4]);
		for(int j=0; j<N; j++) {
		for(int i=0; i<N; i++) {
			if(b[j]==c[i]) {
				answer++;
			}
		}
		}
		System.out.println(answer);
		//중복된 값 계산
		
	}

}
