

/* The problem is about finding the Sum of Cube of number 
 * Ranging from N to M and showing it in output Screen
 * while if the First number is greater than second it'll give return as zero
 */

package prob_Stmt;
import java.util.Scanner;
public class prob1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the first value");
		int N = sc.nextInt();
		System.out.println("Enter the second value");
		int M= sc.nextInt();
		System.out.println("The addition of cubes are:"+sumofCubes(N,M));
		sc.close();
	}
public static int sumofCubes(int N, int M) {
	if (N>M) {
		System.out.println("Check the input number rang it's wrong!!");
		return 0;
	}
	int sum=0;
	int y;
	for(int i=N;i<=M;i++) {
		y=i*i*i;
		sum+=y;
	}
	//System.out.println("The addition of cubes are:"+sum);
	return sum;
}
}
