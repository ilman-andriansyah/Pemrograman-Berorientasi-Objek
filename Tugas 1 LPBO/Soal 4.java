import java.util.Scanner;

public class ilman10519069_soal4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//
		System.out.print("x : ");int xav = input.nextInt();
		System.out.print("y : ");int yom = input.nextInt();
		if(xav>0&&yom>0){System.out.print("P("+xav+","+yom+")Kuadran I");}
		else if(xav<0&&yom>0){System.out.print("P("+xav+","+yom+")Kuadran II");}
		else if(xav<0&&yom<0){System.out.print("P("+xav+","+yom+")Kuadran III");}
		else if(xav>0&&yom<0){System.out.print("P("+xav+","+yom+")Kuadran IV");}
		else{System.out.print("Tidak terletak pada kuadran manapun");}
	}
}
