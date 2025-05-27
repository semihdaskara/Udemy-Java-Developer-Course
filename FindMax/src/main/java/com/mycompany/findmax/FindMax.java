package com.mycompany.findmax;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		int a=scanner.nextInt();
		System.out.println("Ikinci sayi: ");
		int b=scanner.nextInt();
		System.out.println("Ucuncu sayi: ");
		int c=scanner.nextInt();
		
		int maks= -1;
		
		if(a>=b && a>=c)
		{
			maks=a;
		}
		else if(b>=a && b>=c)
		{
			maks=b;
		}
		else
		{
			maks=c;
		}
		
		System.out.println("Maksimum sayi: " +maks);
    }
}
