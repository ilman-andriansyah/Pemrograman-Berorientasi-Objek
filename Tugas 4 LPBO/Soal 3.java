import java.util.Scanner; 
public class  ilman10519069_soal3{ 
public static void main (String [] args) { 
	Scanner nilai = new Scanner (System.in); 
	int i,angka;
	for(i=0;i<10;i++){
		System.out.print("Input Angka [0-9] : ");angka=nilai.nextInt(); 
		if(angka==1){System.out.println("Satu");}
		else if(angka==2){System.out.println("Dua");}
		else if(angka==3){System.out.println("Tiga");}
		else if(angka==4){System.out.println("Empat");}
		else if(angka==5){System.out.println("Lima");}
		else if(angka==6){System.out.println("Enam");}
		else if(angka==7){System.out.println("Tujuh");}
		else if(angka==8){System.out.println("Delapan");}
		else if(angka==9){System.out.println("Sembilan");}
		else if(angka==0){System.out.println("Keluar Program");System.exit(0);}
		else {break;}
	}
	}
}