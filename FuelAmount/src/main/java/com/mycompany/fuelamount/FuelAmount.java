package com.mycompany.fuelamount;

import java.util.Scanner;

public class FuelAmount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.print("Araciniz km'de kaç kurus yakiyor? (Örnek: 0,32)");
		double kurus = scanner.nextDouble();
		System.out.print("Aracinizla kac km gittiniz? : ");
		int km = scanner.nextInt();

		System.out.print("Toplam odemeniz gereken tutar: " + (kurus * km) + "TL'dir...");
    }
}
