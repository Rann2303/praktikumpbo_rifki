package Praktikum2;

import java.util.Scanner;

public class PengkondisianIF {
	public static void main(String args[]) {
//		inisialisasi
		int angka1, angka2, hasil, perhitungan;
		Scanner input = new Scanner(System.in);
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
//		Kondisi IF
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