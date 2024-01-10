package com.demo.test;
import com.demo.beans.Product;
import com.demo.services.*;
import java.util.Scanner;
public class TestProduct {

	public static void main(String[] args) {
		ProductServicesImpl psrvc = new ProductServicesImpl();
		Scanner Sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("==============================");
			System.out.println("0. Exit");
			System.out.println("1. Display Product List");
			System.out.println("2. Display Product By ID");
			System.out.println("3. Insert Product");
			System.out.println("------------------------------");
			System.out.println("Enter Choice : ");
			choice = Sc.nextInt();
			switch(choice) {
			case 0: System.exit(0);
			case 1: psrvc.getAll();
					break;
			case 2: System.out.println("Enter Product ID : ");
					int id = Sc.nextInt();
					psrvc.showById(id);
					break;
			case 3: System.out.println("Enter Product ID : ");
					int pid = Sc.nextInt();
					System.out.println("Enter Product Description : ");
					String desc = Sc.nextLine();
					Product tmp_p = new Product(pid, desc);
					psrvc.addProduct(tmp_p);
					break;
			default:System.out.println("Thank You !!");
			}
		}while(choice!=0);
	}

}
