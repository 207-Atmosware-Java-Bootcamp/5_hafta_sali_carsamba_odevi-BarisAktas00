import java.util.Scanner;

public class Asal {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz");
		int number=scan.nextInt();
		
		int i;
		
	
			for( i=2;i<=number;i++) {
			   if((number%i)==0  ) {
				  
				  break;
			
			       }
			}	
		
			if(number!=i) {
				System.out.println(number+" Asal Sayi değildir");
			}else {
				System.out.println(number +" Asal sayidir");
			}
			
			
			
		
			
		
	}
	
}
