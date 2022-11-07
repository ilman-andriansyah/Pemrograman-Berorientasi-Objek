import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ilman10519069_soal3{
	public static void main(String[]args){
		try{
			int ideal,hasil;
			BufferedReader input = new
			BufferedReader(new InputStreamReader(System.in));
			System.out.print("Input Tinggi Badan 	: ");
			int tinggi = Integer.parseInt(input.readLine());
			System.out.print("Input Jenis Kelamin 	: ");
			char gender = input.readLine().toUpperCase().charAI(0);
			if(gender=='L'){
				ideal=100;
			}
			else{
				ideal=110;
			}
			hasil=tinggi-ideal;
			if(gender=='L' || gender=='P'){
				System.out.println("Berat Badan Ideal Anda Adalah"+hasil);
			}
			else{
				System.out.println("Maaf, Perintah yang Anda Masukkan Salah.
				Silahkan Ulangi Kembali ");
			}
		}catch(IOException e){
			
		}
	}
}
