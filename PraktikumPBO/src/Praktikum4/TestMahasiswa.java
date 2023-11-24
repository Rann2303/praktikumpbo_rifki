package Praktikum4;

import java.util.Scanner;

public class TestMahasiswa {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		String nama;
		int npm;
		
		System.out.println("Masukkan Nama : ");
		nama = input.next();
		System.out.println("Masukkan NPM : ");
		npm = input.nextInt();
		
		Mahasiswa murid = new Mahasiswa();
		murid.setNama(nama);
		murid.setNpm(npm);
		
		System.out.println("Nama Mahasiswa : "+murid.nama
				+ "\nNpm Mahasiswa : "+murid.npm);
	}
}
