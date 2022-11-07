import javax.swing.JOptionPane;

public class ilman10519069_soal1{
	public static void main (String[] args){
		String input = JOptionPane.showInputDialog(null, "Masukkan kata ke-1");
		String data1 = input;
		
		input = JOptionPane.showInputDialog(null, "Masukkan kata ke-2");
		String data2 = input;
		
		input = JOptionPane.showInputDialog(null, "Masukkan  kata ke-3");
		String data3 = input;
		
		System.out.printf("Hasil Penggabungan Kata : "+data1+" "+data2+" "+data3);
		
	}
}