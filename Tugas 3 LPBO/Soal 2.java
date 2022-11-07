package sorting;

import java.util.Scanner;

public class ilman10519069_soal2{
public static void main(String[] args){
	Scanner scan = new Scanner (System.in);
	System.out.print("Masukan angka yang akan di masukan : ");
	int jmlAngka = scan.nextInt();
	System.out.println("");
	int bil[] = new int [jmlAngka];
	for (int i=0;i<jmlAngka;i++){
	System.out.print("Input nilai ke-"+(i)+ " : ");
	bil[i] = scan.nextInt();}
	SelectionASC(bil);
	System.out.println("");
	System.out.print("Setelah diurut : ");for(int i = 0; i < bil.length; i++){System.out.print(bil[i] + " ");}
}
static int [] SelectionASC (int[] bil) {
for(int i=0; i<bil.length; i++){
for(int j=i+1; j<bil.length; j++){
if(bil[i] > bil[j]){
int temp = bil[j];
bil[j] = bil[i];
bil[i] = temp;
			}
		}
	}
return bil;
}

static int [] SelectionDesc (int[] bil) {
for(int i=0; i<bil.length; i++){
for(int j=i+1; j<bil.length; j++){
if(bil[i] < bil[j]){
int temp = bil[j];
bil[j] = bil[i];
bil[i] = temp;
	}
  }
}
return bil;
  }
}