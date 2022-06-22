import java.util.Scanner;

public class Vize {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Vize notunu giriniz: ");
		int vize=scan.nextInt();
		System.out.println("Final notunuzu giriniz: ");
		int finalNotu=scan.nextInt();
		
		int avg=(vize+finalNotu)/2;
		System.out.println("Ortalamanız: "+avg);
		
		if(avg<50) {
			System.out.println("Sınıfta Kaldınız!");
		}else if(avg>=50 && avg<55) {
			System.out.println("Geçtiniz!");
		}else if(avg>=55 && avg<=70) {
			System.out.println("Notunuz BB");
		}else if(avg>70 && avg<=84 ) {
			System.out.println("Notunuz BA");
		}else {
			System.out.println("Notunuz BA");
		}
		
		
		
	}
	
}
