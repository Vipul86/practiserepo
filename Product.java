
public class Product {
	Node head;
	
	 class Node{
	   int product_number;
	   String name;
	   int price;
	   int quantity;
	   String category;
	   Node prev;
	   Node next;
	  Node(int p_no,String name,int price,int quantity,String category){
		   this.product_number=p_no;
		   this.name=name;
		   this.price=price;
		   this.quantity=quantity;
		   this.category=category;
		   this.next=null;
		   this.prev=null;
	   }
	}
	 
		public void addProduct(int prod_numb,String name,int price,int quantity,String category) {
			
			Node d=new Node(prod_numb,name,price,quantity,category);
			
			if(head==null) {
				head=d;
			   return;
			}
			
			Node ptr=head;
			while(ptr.next!=null) {
				
				ptr=ptr.next;
			}
			ptr.next=d;
			d.prev=ptr;
			d=head;
			}
		
		public void searchNode(int prod_no) {
			
			Node ptr=head;
			System.out.println("Product.No \tName \t\tPrice \t\tQuantity \tCategory");
			while(ptr!=null) {
				if(ptr.product_number==prod_no) {
					System.out.println(ptr.product_number+"\t\t"+ptr.name+"\t\t"+ptr.price+"\t\t"+ptr.quantity+"\t\t"+ptr.category);
				}
				ptr=ptr.next;
			}
		}
		
		public void deleteNode(int prod_no) {
						
		    Node ptr=head;
			while(ptr.next!=null) {
			
			    if(ptr.product_number==prod_no) {
								
					if (head == null || ptr==null) {
			            return;
			        }
					if(head==ptr) {
						head=ptr.next;
						return;
					
					}
					ptr.next.prev=ptr.prev;
					ptr.prev.next=ptr.next;
		    	  }
				ptr=ptr.next;
			} 
		}
		
		public void display() {
			
		    	Node tra=head;
			   System.out.println("Product.No \tName \t\tPrice \t\tQuantity \tCategory");
			 
			  while(tra != null) {
			
				System.out.println(tra. product_number+"\t\t"+tra.name+"\t\t"+tra.price+"\t\t"+tra.quantity+"\t\t"+tra.category);
				tra=tra.next;
			 }
			
			}
			
}
