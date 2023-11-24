package Tugas;
//Ikbal Santosa (221106043021) - Regular A
//Rifki Adi Nugraha (221106043037) - Regular A
import java.util.Scanner;

public class Tabungan {
	public static void main(String args[]) {
	int awal, ambil, sekarang;
	Scanner input = new Scanner(System.in);
	
	System.out.println("===Program Penarikan Uang===");
	
	System.out.print("Masukkan Saldo Awal : ");
	awal = input.nextInt();
	System.out.print("Jumlah Uang Yang Diambil : ");
	ambil = input.nextInt();
	
	sekarang = awal - ambil;
	System.out.println("Saldo Anda Sekarang : "+sekarang);
	}
}
