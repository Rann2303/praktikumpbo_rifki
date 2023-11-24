package Tugas;
//Ikbal Santosa (221106043021) - Regular A
//Rifki Adi Nugraha (221106043037) - Regular A
public class TandanyaKamu {
	private int tahunIni;
	private int tahunLahir;
	
	public void settahunIni(int tahunIni) {
		this.tahunIni = tahunIni;
	}
	public int gettahunIni() {
		return tahunIni;
	}
	public void settahunLahir(int tahunLahir) {
		this.tahunLahir = tahunLahir;
	}
	public int gettahunLahir() {
		return tahunLahir;
	}
	
	public static void main(String[]args) {
		TandanyaKamu tahun = new TandanyaKamu();
		tahun.settahunIni(2023);
		tahun.settahunLahir(1970);
		int umur = tahun.gettahunIni()-tahun.gettahunLahir();
		
		System.out.println("Masukkan Tahun Lahir Anda : "+tahun.gettahunLahir());
		
		System.out.println("===== Hasil Perhitungan =====");
		System.out.println("Tahun Lahir Anda : "+tahun.gettahunLahir());
		System.out.println("Hari Ini Tahun : "+tahun.gettahunIni()+"\n");
		System.out.println("Umur kamu sampai hari ini adalah "+umur +" tahun"+"\n\n");
		
		if(umur >= 0 && umur < 5) {
			System.out.println("Tandanya Kamu Lagi Lucu-lucunya");
		} else if(umur >= 5 && umur < 10) {
			System.out.println("Tandanya Kamu Masih Anak-anak");
		}else if(umur >= 10 && umur < 13) {
			System.out.println("Tandanya Kamu Masih Remaja");
		}else if(umur >= 13 && umur < 19) {
			System.out.println("Tandanya Kamu Alay");
		}else if(umur >= 19 && umur < 29) {
			System.out.println("Tandanya Kamu Lagi Galau Nyari Jodoh");
		}else if(umur >= 29 && umur < 35) {
			System.out.println("Tandanya Kamu Lagi Sibuk Nyari Uang");
		}else if(umur >= 35 && umur < 150) {
			System.out.println("Tandanya Kamu Sudah Tua");
		}else if(umur > 0 && umur >= 150) {
			System.out.println("Tandanya Kamu Tidak Terdeteksi Kehidupan");
		}
	}
}
