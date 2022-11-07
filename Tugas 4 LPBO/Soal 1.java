import java.util.scanner;
public class ilman10519069_soal1{
	public static void main(String[ ] args){
		int hasil = 1;int angka, pangkat;
		Scanner a=new Scanner(System.in);
		System.out.printIn("Input Bil 1 : ");angka=a.nextInt();
		System.out.printIn("Input Bil 2 : ");scanner b=new Scanner(System.in);pangkat=b.nextInt();
		for(int i=1;i<=pangkat;i++){hasil=hasil*angka;}
		System.out.println(angka+" pangkat "+pangkat+" = " +hasil);
	}
}