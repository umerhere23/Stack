package stack;

import java.util.Scanner;

public class balancedcli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
        balanced bal = new balanced("([{",")]}");
        
        int result = 0;
        String expression =null;
        final String Stop ="X";
        while(!Stop.equals(expression)) {
         System.out.println("Enter expression");
         expression = scan.nextLine();
        
         result=bal.test(expression);
         if(result ==1) {
        	 System.out.println("Unbalanced \n");
         }
        	 else
        		 if(result==2)
        			 System.out.println("Premature");
        		 else
        			 System.out.println("Balanced");
         }
         System.out.println(result);
        }    
	

	}


