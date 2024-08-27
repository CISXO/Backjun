package grap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class dfs_bfs {
	static StringBuilder sb = new StringBuilder();
	static Stack<Integer> stack = new Stack<>();
	static Queue<Integer> queue = new LinkedList<>();
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static int n, v, m;
	static boolean []check;
	static boolean [][]arr;
	public static void main(String[] args) throws NumberFormatException, IOException{
		String str = bf.readLine();
		StringTokenizer stk = new StringTokenizer(str);
		
		n = Integer.parseInt(stk.nextToken());
		m = Integer.parseInt(stk.nextToken());
		v = Integer.parseInt(stk.nextToken());
		check = new boolean[n+1];
		
		arr = new boolean[n+1][n+1];
		
		for(int i=0; i<m; i++) {
			str = bf.readLine();
			stk = new StringTokenizer(str);
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			arr[a][b] = true;
			arr[b][a] = true;
		}
		
		dfs2(v);
		sb.append('\n');
		check = new boolean[n+1];
		bfs(v);
		System.out.println(sb);
		
		
	}
	
	static void dfs(int v) {
	check[v] = true;
	sb.append(v+ " ");

	for (int i = 1; i<n+1; i++) {
		if (arr[v][i] && !check[i]) {
			dfs(i);
		}
	}
}
	
	
	static void dfs2(int v) {
        stack.push(v); // 시작 정점을 스택에 push

        while (!stack.isEmpty()) {
            v = stack.pop(); // 스택에서 정점을 꺼내옴
            if (!check[v]) {
                check[v] = true;
                sb.append(v).append(" ");
            }

            // 현재 정점과 연결된 정점 중에서 방문하지 않은 정점을 스택에 push
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[v][i] && !check[i]) {
                    stack.push(i);
                }
            }
        }
    }
	
	static void bfs(int v) {
		queue.add(v);
		check[v] = true;
		
		while(queue.isEmpty() == false) {
			v = queue.poll();
			sb.append(v + " ");
			for(int i=0; i<n+1; i++) {
				if(arr[v][i] && !check[i]) {
					queue.add(i);
					check[i] = true;
				}
			}
		}
	}

}