import java.util.Scanner;

public class ilman10519069_soal2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//
		System.out.print("A: ");int A = input.nextInt();
		System.out.print("B: ");float B = input.nextFloat();
		String hasil;
		hasil=(A==B)?"Nilai A dan B sama besar":
		(A>B)?"Nilai A lebih besar dari B":"Nilai B lebih besar dari A";
		System.out.println(hasil);
	}
}