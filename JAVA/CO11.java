public class CO11{
	
	String pcode, pname;
	double price;
	
	public void details(){
		System.out.println("The product name is : "+pname);
		System.out.println("The product code is : "+pcode);
		System.out.println("The product price is : "+price);
		System.out.println("\n");
	}
	
	public static void main(String[] args){
		
		CO11 p1= new CO11();
		p1.pcode= "P1001";
		p1.pname= "pen";
		p1.price= 20;
		p1.details();
		
		CO11 p2= new CO11();
		p2.pcode= "P1002";
		p2.pname= "Papper";
		p2.price= 60;
		p2.details();
		
		CO11 p3= new CO11();
		p3.pcode= "P1003";
		p3.pname= "BOOK";
		p3.price= 100;
		p3.details();
		
		
		System.out.println("\n");
		if(p1.price<p2.price && p1.price<p3.price){
			System.out.println("\n\nProduct with lowest price is :");
			p1.details();
		}
		else if(p2.price < p3.price){
			System.out.println("\n\nProduct with lowest price is :");
			p2.details();
		}
		else{
			System.out.println("\n\nProduct with lowest price is :");
			p3.details();
		}
	}
}