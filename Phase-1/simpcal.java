package simplecalculator;
import java.util.Scanner;
public class simpcal {
	
	public static void main(String[] args) {
		
		char operator;
	    double num1,num2,ans;
	    Scanner sc=new Scanner(System.in);
	    
	    
	    System.out.println("Enter first number");
	    num1 = sc.nextDouble();
	    
	    System.out.println("Enter second number");
	    num2 = sc.nextDouble();
	    
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = sc.next().charAt(0);
	    
	    switch (operator) {
	    case '+':
	        ans = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + ans);
	        break;
	    case '-':
	        ans = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + ans);
	        break;
	    case '*':
	        ans = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + ans);
	        break;
	    case '/':
	        ans = num1/ num2;
	        System.out.println(num1 + " / " + num2 + " = " + ans);
	        break;
	    default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	  
	}

}