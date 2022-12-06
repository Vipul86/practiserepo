import java.util.Scanner;

public class ProductManagement {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
		
            	System.out.println("Enter the Username ");
	                String username=sc.next();
	                System.out.println("Enter the Password ");
	                String password=sc.next();
	        		     
		    if(username.equals("10_Bytes") && password.equals("123@abc")) {
	        	System.out.println("login successful");
	        	int choice;
          		Management manage=new Management();
	        	do {
	   			 System.out.println("Choose an Option"); 
	   			 System.out.println("1.Add Product");
	   			 System.out.println("2.View Product");
    			 System.out.println("3.Search a product");
	   			 System.out.println("4.Delete Product");
	   			 System.out.println("5.Exit");
	   			 choice=sc.nextInt();
	   			 switch(choice)
	   			 {
	   			 case 1 :	System.out.println("Enter the number of product ");
	   			              int n =sc.nextInt();
	   			                for(int i=0;i<n;i++){
	   				              manage.add_Product(); 
	   			                }
	   			            break;
	   			        
	   			 case 2 : manage.display_Products();
	   			        break;
	   			 case 3 :manage.search_Product(); 
	   		            break;  
	   			 case 4 :manage.delete_Products();
	   		             break;
	   		     case 5 :System.out.println("Thanks for using "); 
	   		    	    break;
	   		     default : System.out.println("Select valid option");
	   			 }
	   		     }while(choice!=5);
	        }
	        else {
	        	System.out.println("Credentials are not correct");
	        }
		    sc.close();

			}
       
		 
	}


