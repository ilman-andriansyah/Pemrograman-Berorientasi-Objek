import java.util.Scanner;

public class ilman10519069_soal1{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Dari : ");
                int x =  input.nextInt();
         System.out.print("Sampai : ");
                int y = input.nextInt();
                for (x=x ; x <= y ; x++){
                    if (x % 2 == 0)
                        System.out.print(x+"  ");
                }
                
    	}
	}