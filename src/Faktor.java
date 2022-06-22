import java.util.Scanner;

public class Faktor {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Faktoriyel icin sayi giriniz:");
		
		int number=scan.nextInt();
		int fak=1;
		
		for(int i=1;i<=number;i++) {
			fak*=i;
			
		}
		System.out.println(fak);
		
		
		
		
		
	}
	
}
