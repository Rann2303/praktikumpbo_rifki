package Praktikum3;
import java.util.Scanner;

public class Latihan {
	public static void main(String args[]) {
//		inisialisasi
		Scanner input = new Scanner(System.in);
		int angka1, angka2, hasil,perhitungan, perulangan;
//		input perulangan
		System.out.println("Masukkan perulangan : ");
		perulangan = input.nextInt();
//		perulangan for
		for(int i = 1; i <= perulangan; i++) {
//		input user
			System.out.print("Masukkan Angka 1: ");
			angka1 = input.nextInt();
			System.out.print("Masukkan Angka 2: ");
			angka2 = input.nextInt();
			System.out.print("List Perhitungan: "
					+ "\n 1 : Pertambahan"
					+ "\n 2 : Pengurangan"
					+ "\n 3 : Perkalian"
					+ "\n 4 : Pembagian"
					+ "\n Masukkan angka perhitungan : ");
			perhitungan = input.nextInt();
//		kondisi if
			if(perhitungan == 1) {
				hasil = angka1 + angka2;
				System.out.println("hasilnya adalah : "+hasil);
			} else if(perhitungan == 2){
				hasil = angka1 - angka2;
				System.out.println("hasilnya adalah : "+hasil);
			} else if(perhitungan == 3){
				hasil = angka1 * angka2;
				System.out.println("hasilnya adalah : "+hasil);
			} else if(perhitungan == 4){
				hasil = angka1 / angka2;
				System.out.println("hasilnya adalah : "+hasil);
			} else {
				System.out.println("Angka perhitungan salah!");
			}
		}
	}
}
