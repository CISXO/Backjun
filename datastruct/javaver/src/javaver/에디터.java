package javaver;

import java.util.Scanner;

public class 에디터 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		StringBuffer str = new StringBuffer(str1);
		int str_num = str.length();
		int legacy = str_num;
		int count = sc.nextInt();
		
		String[] arr = new String[count];

		sc.nextLine();
		
		for(int i=0; i<count; i++) {
			arr[i] = sc.nextLine();
			if(arr[i].charAt(0) == 'L') {
				
				if(str_num!=0)
				str_num-=1;

			} else if(arr[i].charAt(0) == 'D') {
				
				if(str_num < legacy)
				str_num+=1;
				
			} else if(arr[i].charAt(0) == 'B') {
				if(str_num!=0) {
				str = str.deleteCharAt(str_num-1);
				legacy-=1;
				str_num-=1;
				}

			} else {
				str.insert(str_num, arr[i].charAt(2));
				legacy +=1;
				str_num+=1;
			}
		}

		System.out.println(str);
		
	}

}
