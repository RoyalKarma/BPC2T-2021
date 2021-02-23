package primeNum;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int inputNum;
	    boolean isprime = true;
	    System.out.print("Input any number: ");
        inputNum = sc.nextInt();
        sc.close();
        
        System.out.println("The tested number is: "+inputNum);
        
        for(int i = 2; i < inputNum; i++){
        		if(inputNum % i == 0) {
        			System.out.println("The number can be divided by:" +i);
        			isprime = false;
        				}
        		
        		}
        if (isprime == true)
            System.out.println(inputNum + " Is a Prime number.");
        else
            System.out.println(inputNum + " Is not a prime number");
       
		}
	}
	