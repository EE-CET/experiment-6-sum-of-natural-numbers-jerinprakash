import java.util.Scanner;
public class SumOfNaturalNumbers {

    // TODO: Create the method public static int NumberSum(int n)
    // It should calculate and return the sum of first n natural numbers
	public static int NumberSum(int n){

		int sum=n*(n+1)/2;

		return sum;
	}

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int n= sc.nextInt();

		int sum= NumberSum(n);

		System.out.println(sum);

	}


        // Inside main method
        // TODO: Read N using Scanner
        // TODO: Call NumberSum(N)
        // TODO: Print the result
    
}
