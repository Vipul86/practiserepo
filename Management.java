import java.util.Scanner;

public class Management {
	Product product=new Product();
	Scanner sc=new Scanner(System.in);
	
	public void add_Product() {
		   System.out.println("Enter the product number ");
		    int p_no=sc.nextInt();
			System.out.println("Enter the name of the product ");
			String name=sc.next();
			System.out.println("Enter the price of the product ");
			int price=sc.nextInt();
			System.out.println("Enter the quantity of the product ");
			int quantity=sc.nextInt();
			System.out.println("Enter the category of the product ");
			String category=sc.next();
			product.addProduct(p_no,name,price,quantity,category);
	}
	
	public void search_Product(){
		
		System.out.println("Enter the product number that you want to search ");
			int numb=sc.nextInt();
			product.searchNode(numb);
	}
	
    public void delete_Products() {
		
		System.out.println("Enter the product number that you want to delete ");
		int numb1=sc.nextInt();

		product.deleteNode(numb1);
	}
		
	public void display_Products() {
	
	   product.display();
	}
}
