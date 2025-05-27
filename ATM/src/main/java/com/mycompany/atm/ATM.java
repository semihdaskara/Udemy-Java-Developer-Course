package com.mycompany.atm;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int bakiye=1000;
		String islemler="1.Islem:Bakiye Ogrenme\n"
				+"2.Islem: Para Cekme\n"
				+"3.Islem: Para Yatirma\n"
				+"Cikis icin q' ya basin.";
		System.out.println("***************");
		System.out.println(islemler);
		System.out.println("***************");
		
		while(true)
		{
			System.out.print("Islemi Seciniz:");
			String islem=scanner.nextLine();
			if(islem.equals("q"))
			{
                            System.out.println("Programdan cikiliyor..");
                            break;
			}
			else if(islem.equals("1"))
			{
				System.out.print("Bakiyeniz: "+bakiye+"\n");
			}
			else if(islem.equals("2"))
			{
				System.out.print("Lütfen cekmek istediginiz miktari girin: ");
				double cikar=scanner.nextDouble();
				
				if(bakiye <= 0)
				{
					System.out.print("Yeterli bakiyeniz bulunmamaktadır. Bakiyeniz:"+bakiye+"\n");
				}
				else
				{
					bakiye-=cikar;
					System.out.print("Bakiyeniz: "+bakiye+"\n");
				}
			}
			else if(islem.equals("3"))
			{
				System.out.print("Lütfen yatirmak istediginiz miktari girin: ");
				double ekle=scanner.nextDouble();
				bakiye+=ekle;
				System.out.print("Bakiyeniz: "+bakiye+"\n");
			}
			else
			{
				System.out.print("Hatali giris yaptiniz. Programdan cikiliyor....");
				break;
			}
		}
    }
}
