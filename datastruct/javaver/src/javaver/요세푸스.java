package javaver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

	public class 요세푸스 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		Queue<Integer> que1 = new LinkedList<Integer>();
		StringTokenizer stk = new StringTokenizer(str);
		StringBuilder sb = new StringBuilder();
		
		
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		bw.write("<");

		for(int i=0; i<N; i++) {
			que1.offer(i+1);
		}
	for(int j=0; j<N-1; j++) {
			for(int i=0;i<K-1;i++) {
				que1.offer(que1.poll());
			}
			sb.append(que1.poll()+", ");
		}
		sb.append(que1.poll() + ">");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
}
	}
