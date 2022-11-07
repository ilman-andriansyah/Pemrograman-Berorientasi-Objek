import java.util.Scanner; 
public class ilman10519069_soal2{ 
public static void main (String [] args) { 
	Scanner nilai = new Scanner (System.in); 
	float panjang,lebar; 
	System.out.printIn("Panjang = ");panjang = nilai.nextFloat(); 
	System.out.printIn("Lebar = ");lebar = nilai.nextFloat(); 
	float Luas , Keliling ; 
	Luas = panjang * lebar; 
	System.out.println("Luas Persegi Panjang = "+Luas); 
	Keliling = 2* (panjang + lebar); 
	System.out.println("Keliling Persegi Panjang = "+Keliling); 
	}
}