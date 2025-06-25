import java.util.Scanner;

public class Main {
	public static int FindHCF(int sayi1,int sayi2) {
		int HCF=1;
		for(int i=1;i<=sayi1 && i<=sayi2;i++) {
			if(sayi1%i ==0 && sayi2%i ==0) {
				HCF=i;
			}
		}
		return HCF;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci sayi: ");
		int birinciSayi = scanner.nextInt();
		System.out.println("İkinci sayi: ");
		int ikinciSayi = scanner.nextInt();
		
		System.out.println("İki sayinin Ebobu: "+ FindHCF(birinciSayi,ikinciSayi));
		
	}
}
