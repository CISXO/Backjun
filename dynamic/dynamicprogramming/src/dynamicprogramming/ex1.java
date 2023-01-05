package dynamicprogramming;

import java.util.Arrays;

public class ex1 {
	 public static int solution(int[] absolutes, boolean[] signs) {
	        int answer=0;
	        for(int i=0;i<absolutes.length;i++) {
	            if(signs[i]==true) {
	                answer+=absolutes[i];
	} else {
	                answer-=absolutes[i];
	}
	        }
	        
	        if(answer < 0) {
	            answer=(answer*(-1));
	}
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		
		int[] absolutes = {1,2,3};
		boolean[] signs = {false,false,false};
		System.out.println(solution(absolutes,signs));
		
	}

}
