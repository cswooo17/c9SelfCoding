package AStudy190724;

import java.util.Scanner;

public class BJ_9095 {

		
	public static void main(String[] args) {
		int[] arr = new int[11];
		int T, n;//n은 양수이며 11보다 작다
		Scanner sc = new Scanner(System.in);

		arr[0] = 0; 
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		T = sc.nextInt();
		for(int i = 0; i< T; i++){
			n = sc.nextInt();
			for(int j = 4; j<=n; j++){
				arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
			System.out.println(arr[n]);
		}
		sc.close();
		
	}

}
