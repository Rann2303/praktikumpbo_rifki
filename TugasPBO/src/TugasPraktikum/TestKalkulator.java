package TugasPraktikum;

import java.util.Scanner;

public class TestKalkulator {
	public static void main(String[] args) {
		System.out.println("Nama : Rifki Adi Nugraha");
		System.out.println("NPM : 221106043037");
		System.out.println("Kelas : Reguler A\n");
		
		Scanner input = new Scanner(System.in);
		int angka1,angka2,perulangan, perhitungan;
		
		System.out.println("Masukkan perulangan : ");
		perulangan = input.nextInt();
		for(int i = 1; i <= perulangan; i++) {
//			input user
				System.out.print("\nMasukkan Angka 1: ");
				angka1 = input.nextInt();
				System.out.print("Masukkan Angka 2: ");
				angka2 = input.nextInt();
				
				Kalkulator Number = new Kalkulator();
				Number.setAngka1(angka1);
				Number.setAngka2(angka2);
				
				System.out.println("\nAngka1 : "+Number.angka1
						+ "\nAngka 2 : "+Number.angka2 + "\n");
				
				System.out.print("List Perhitungan: "
						+ "\n 1 : Pertambahan"
						+ "\n 2 : Pengurangan"
						+ "\n 3 : Perkalian"
						+ "\n 4 : Pembagian"
						+ "\n Masukkan angka perhitungan : "+"\n");
				perhitungan = input.nextInt();
				
				Kalkulator hitung = new Kalkulator();
				hitung.penjumlahan(angka1, angka2);
				hitung.pengurangan(angka1, angka2);
				hitung.perkalian(angka1, angka2);
				hitung.pembagian(angka1, angka2);
				
				if(perhitungan == 1) {
					System.out.println("-----Penjumlahan-----");
					System.out.println("hasil Penjumlahan adalah : "+hitung.penjumlahan(angka1, angka2));
				} else if(perhitungan == 2){
					System.out.println("-----Pengurangan-----");
					System.out.println("hasil Pengurangan adalah : "+hitung.pengurangan(angka1, angka2));
				} else if(perhitungan == 3){
					System.out.println("-----Perkalian-----");
					System.out.println("hasil Perkalian adalah : "+hitung.perkalian(angka1, angka2));
				} else if(perhitungan == 4){
					System.out.println("-----Pembagian-----");
					System.out.println("hasil Pembagian adalah : "+hitung.pembagian(angka1, angka2));
				} else {
					System.out.println("Angka perhitungan salah!");
				}
	}
}
}
