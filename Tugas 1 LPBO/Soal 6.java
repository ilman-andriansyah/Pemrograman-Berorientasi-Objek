package Latihan1;
import java.util.Scanner;
public class ilman10519069_soal6{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Jumlah Pudding : ");
		int pud = input.nextInt();
		System.out.print("Jumlah Jelly 	 : ");
		int jel = input.nextInt();
		if(pud+jel>=6&&pud+jel<=11){
			System.out.println("Pestanya Baik");
		}
		else if(pud*jel>=jel||jel*2>=pud){
			System.out.println("Pestanya Luar Biasa");
		}
		else{
			System.out.println("Pestanya Jelek");
		}
	}
}