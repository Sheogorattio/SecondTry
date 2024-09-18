package SecondTry;
import java.io.*;
import java.util.Scanner;

public class Program {
	static public void main(String[] args) throws IOException {
		//task1();
		//task2();
	}
	
	static void task1 () {
		final Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();
		
		if(N>=1 && N <= 100) {
			if(N%2 ==1 ) {
				System.out.println("Weird");
			}
			else if (N%2 ==0){
				if(N >2 && N < 5) {
					System.out.println("Not Weird");
				}
				else if(N>6 && N <=20) {
					System.out.println("Weird");
				}
				else {
					System.out.println("Not Weird");
				}
			}
		}
	}
	
	static void task2() throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", N, i, N * i));
        }
	}
}
