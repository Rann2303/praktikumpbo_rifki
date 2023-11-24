package Tugas;
//Ikbal Santosa (221106043021) - Regular A
//Rifki Adi Nugraha (221106043037) - Regular A
public class Perulangan {
	private int Cetak;
	private String Nama;
	
	public void setCetak(int cetak) {
		this.Cetak = cetak;
	}
	public void setNama(String nama) {
		this.Nama = nama;
	}
	public int getCetak() {
		return Cetak;
	}
	public String getNama() {
		return Nama;
	}
	
	public static void main(String[] args) {
		System.out.println("===== Aplikasi Pencetak Nama =====");
		Perulangan Nama1 = new Perulangan();
		Nama1.setNama("Rizki Adam Kurniawan");
		System.out.println("Masukkan Nama Anda : "+Nama1.getNama());
		Perulangan Cetak1 = new Perulangan();
		Cetak1.setCetak(5);
		System.out.println("Mau cetak berapa kali? : "+ Cetak1.getCetak());
		System.out.println("Nama Anda : "+ Nama1.getNama());
		System.out.println("Hasil Cetak : ");
		String Hasil = Nama1.getNama();
		for (int i = 1; i <= Cetak1.getCetak(); i++) {
			System.out.println(i+". " + Hasil);
		}
	}
}
