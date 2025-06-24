import java.util.Scanner;

public class Main {
	public static int cikarma(int a,int b) {
		return (a-b);
	}
	public static double bolme(int a,int b) {
		return ((double)a/b);
	}
	public static int toplama(int a,int b) {
		return (a+b);
	}
	public static int toplama(int a,int b,int c) {
		return (a+b+c);
	}
	public static int carpma(int a,int b) {
		return (a*b);
	}
	public static int carpma(int a,int b,int c) {
		return (a*b*c);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String islemler = "1. Toplama İşlemi\n"
				+"2. Çıkarma İşlemi\n"
				+"3. Çarpma İşlemi\n"
				+"4. Bölme İşlemi\n"
				+"Çıkış için q'ya basın.";
		System.out.println("*****************************");
		System.out.println(islemler);
		System.out.println("*****************************");
		while(true) {
			System.out.println("İşlemi Seçin:");
			String islem = scanner.nextLine();
			if(islem.equals("q")) {
				System.out.println("Programdan çıkılıyor...");
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("Kaç değer toplayacaksınız?(2 veya 3)");
				int kacSayi = scanner.nextInt();
				if(kacSayi==2) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen sayıların toplamı: " + toplama(a,b));
				}
				else if(kacSayi ==3) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("c:");
					int c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen sayıların toplamı: " + toplama(a,b,c));
				}
				else {
					System.out.println("Böyle bir method bulunmuyor.");
				}
			}
			else if(islem.equals("2")) {
				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b:");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Girilen sayıların farkları: " + cikarma(a,b));
			}
			else if(islem.equals("3")) {
				System.out.println("Kaç değer çarpacaksınız?(2 veya 3)");
				int kacSayi = scanner.nextInt();
				if(kacSayi==2) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen sayıların çarpımı: " + carpma(a,b));
				}
				else if(kacSayi ==3) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("c:");
					int c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen sayıların çarpımı: " + carpma(a,b,c));
				}
				else {
					System.out.println("Böyle bir method bulunmuyor.");
				}
			}
			else if(islem.equals("4")) {
				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b:");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Girilen sayıların bölümü: " + bolme(a,b));
			}
			else {
				System.out.println("Geçersiz İşlem!!!!");
			}
		}		
	}
}
