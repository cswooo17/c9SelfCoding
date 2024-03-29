package AStudy190724;

import java.util.*;

public class BJ_1018 {
	static int n, m;
	static int[][] arr;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();//행
		m = sc.nextInt();//열
		arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			String t = sc.next();
			for (int j = 0; j < m; j++)
				arr[i][j] = t.charAt(j);
		}
		//8*8
		int result = Integer.MAX_VALUE;
		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				result = Math.min(result, solve(i, j));
			}
		}
		System.out.println(result);
	}

	private static int solve(int x, int y) {
		// 시작이 검운색일 경우
		int result = 0;
		int temp = 'B';
		for (int i = x; i < x + 8; i++) {
			if (arr[i][y] != temp)
				result++;
			for (int j = y + 1; j < y + 8; j++) {
				if (arr[i][j] == temp) {
					result++;

					if (temp == 'B')
						temp = 'W';
					else
						temp = 'B';

				} else
					temp = arr[i][j];
			}
		}

		// 시작이 흰색인 경우
		int result2 = 0;
		temp = 'W';
		for (int i = x; i < x + 8; i++) {
			if (arr[i][y] != temp)
				result2++;
			for (int j = y + 1; j < y + 8; j++) {
				if (arr[i][j] == temp) {
					result2++;
					if (temp == 'B')
						temp = 'W';
					else
						temp = 'B';

				} else
					temp = arr[i][j];
			}
		}
		return result > result2 ? result2 : result;

	}

}
