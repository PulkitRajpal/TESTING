import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int[] arr = new int[x];
		
		for (int i = 0; i < x; i++) {
			int y = scn.nextInt();
			arr[i] = y;
			}
		int p = scn.nextInt();
		int[] ar = new int[x];
		
		for (int i = 0; i < x; i++) {
			int q = scn.nextInt();
			arr[i] = q;
			}
		if(arr[2]==ar[2]){
			System.out.print(arr[2]);
		}
	}
}
