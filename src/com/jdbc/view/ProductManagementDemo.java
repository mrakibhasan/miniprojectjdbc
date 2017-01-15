package com.jdbc.view;

import java.util.Scanner;

import com.jdbc.BO.*;
import com.jdbc.DTO.*;
public class ProductManagementDemo {

	public static void main(String[] args) throws Exception {
		CategoryBO cbo=new CategoryBO();
		ProductBO pbo=new ProductBO();
		Scanner userChoice=new Scanner(System.in);
		int selection;
		do{
			System.out.println("------------------------------------------------------");
			System.out.println("Select Your Operation");
			System.out.println("'1' - View all the category ");
			System.out.println("'2' - delete category information");
			System.out.println("'3' - view all product by CategoryID");
			System.out.println("'4' - delete product information ");
			System.out.println("'5' - view largestProduction");
			System.out.println("'6' - delete product information from a Category");
			System.out.println("'7' - view recent Products");
			System.out.println("'8' - getAvgNumberofproducts ");

			System.out.println("'0' - Quit:\n");
			System.out.println("------------------------------------------------------");

			selection=userChoice.nextInt();
			switch(selection){
			case 1: 
				for(Category categories:cbo.gellAllCategory()){
					System.out.println(categories.getId()+" "+categories.getName());

				}
				break;
			case 2: 
				System.out.println("Enter the category Io delete");
				int deleteid=userChoice.nextInt();
				if(cbo.deletecategoryInfo(deleteid)>0){
					System.out.println("delete category Successfully: "+deleteid);

				}
				break;
			case 3:
				System.out.println("Enter category ID to see the products");
				int pcid=1;
				for(Product products:pbo.getProductByCategory(pcid)){
					System.out.println(products.getId()+" "+products.getName()+" "+products.getDescription());

				}
				break;
			case 4: 
				System.out.println("Enter the category Io delete");
				int deletepid=userChoice.nextInt();
				if(cbo.deletecategoryInfo(deletepid)>0){
					System.out.println("delete category Successfully: "+deletepid);

				}
				break;
			case 5: 
				for(Product products:pbo.getProductByLargestDescription()){
					System.out.println(products.getId()+" "+products.getName()+" "+products.getDescription());

				}
				break;
			case 6:
				System.out.println("Enter category ID delete product information from a Category");
				int deletepid1=userChoice.nextInt();
				if(cbo.deletecategoryInfo(deletepid1)>0){
					System.out.println("delete category Successfully: "+deletepid1);

				}
				break;
			case 7: 
				for(Product products:pbo.getRecentProducts()){
					System.out.println(products.getId()+" "+products.getName()+" "+products.getDescription());

				}
				break;
			case 8: 
				if(pbo.getAvgNumberofproducts()>=0){
					System.out.println(pbo.getAvgNumberofproducts());
				}
				break;
			case 0:
				break;
			default: 
				System.out.println("Sorry");



			}

		}while(selection!=0);


	}


}
