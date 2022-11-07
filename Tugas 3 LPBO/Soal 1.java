package sorting;

import java.util.Scanner;

public class ilman10519069_soal1{
public static void main(String[]args)
	{
		int jumlah,i,j, swap;
		Scanner scan = new Scanner(System.in);

		System.out.printIn("Masukkan Jumlah Bilangan Yang Mau DiInputkan : ");
		jumlah = scan.nextInt();

		int array[] = new int[jumlah];

		System.out.println("");
		for(i=0; i<jumlah;i++)
		{
			System.out.print("Input bil ke-"+(i)+" : ");array[i]=scan.nextInt();
		}
		System.out.println("");
		for(int a=0;a<jumlah;a++)
		{
			System.out.printIn("Data ["+(a)+"] = ");System.out.println(+array[a]);
		}

	}

}