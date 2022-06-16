package corejava;

import java.util.Scanner;

public class ToyExample {
     	//Declaring Two Dimensional Array
	   String[][] toys = new String [6][6];

	    //Default Constructor
	    ToyExample()
	    {

	    toys [0][0]="1";
	    toys[0][1]="train";
	    toys[0][2]="Bus";
        	
	    toys [1][0]="2";
	    toys [1][1] ="Doll";
	    toys [1][2] ="Barbie Doll";

	    toys [2][0]="3";
	    toys [2][1]="Teddy Bear";
	    toys [2][2]="Baby Doll";

	    toys [3][0]="4";
	    toys [3][1]="Kite";
	    toys [3][2]="Puppy";

	    toys [4][0]="5";
	    toys[4][1]="Airplane";
	    toys[4][2]="Rocket";
	    
	    toys [5][0]="6";
	    toys[5][1]="Sudoku";
	    toys[5][2]="Ludo";

	    }
        //Creating Function For Switch Case
     public static String getToy(int price)
	    {
        //Price For Toys 
	        String ToyShop;
	        switch(price)
	        {
	            case 200: 
	            case 250:
	            	 ToyShop = "Bus";
		              return ToyShop;
	            case 300:
	            case 350:
	                ToyShop = "train";
	                return ToyShop;
	            
	            case 400:
	            	ToyShop = "Barbie Doll";
	                return ToyShop;
	            case 450:
	                ToyShop = "Doll";
	                return ToyShop;
	                
	            case 500:
	            case 550:
	            	 ToyShop = "Baby Doll";
	            	 return ToyShop;
	            case 600:
	            case 650:
	                ToyShop = "Teddy Bear";
	                return ToyShop;
	                
	            case 100:
	            	 ToyShop = "Puppy";
		              return ToyShop;
	            case 150:
	                ToyShop = "Kite";
	      	         return ToyShop;
	                
	            case 700:
	            	ToyShop = "Airplane";
	  	             return ToyShop;
	            case 750:
	                ToyShop = "Rocket";
	  	             return ToyShop;
	            case 850:
	                ToyShop = "Sudoku & Ludo";
	                return ToyShop;
	                
	            default:
	                ToyShop = "No Toys Available in this Range";
	                return ToyShop;
	        }
	    }
        public static void main(String[] args) {
	    	System.out.println("Enter The BudgetPrice For Toys: ");
	    	//Creating Object Of Scanner Class
	        Scanner sc = new Scanner (System.in); 
	        //Taking Input From User
	        int price = sc.nextInt ();
	        //Calling Price Function 
	        System.out.println("This Are The Toys In This Range : " +getToy(price));
            sc.close();
	    }
	}
