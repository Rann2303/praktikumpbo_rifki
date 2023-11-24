package Tugas;
//Ikbal Santosa (221106043021) - Regular A
//Rifki Adi Nugraha (221106043037) - Regular A
public class Gaji {
	private String nama;
	private String alamat;
	private int uangTransport;
	private int uangTunjangan;
	private int gajiPokok;
	private int totalGaji;
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNama() {
		return nama;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setTunjangan(int uangTunjangan) {
		this.uangTunjangan = uangTunjangan;
	}
	public int getTunjangan() {
		return uangTunjangan;
	}
	public void setTransport(int uangTransport) {
		this.uangTransport = uangTransport;
	}
	public int getTranspor() {
		return uangTransport;
	}
	public void setgajiPokok(int gajiPokok) {
		this.gajiPokok = gajiPokok;
	}
	public int getgajiPokok() {
		return gajiPokok;
	}
	public void settotalGaji(int totalGaji) {
		this.totalGaji = totalGaji;
	}
	public int gettotalGaji() {
		return totalGaji;
	}
	
	public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {
		this.totalGaji = this.uangTunjangan + this.uangTransport + this.gajiPokok;
		return this.totalGaji;
	}
	
	public void data(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji) {
		System.out.println("##DATA GAJI KARYAWAN##"+"\n"
														+"----------------------");
		System.out.println("Nama Karyawan : "+this.nama);
		System.out.println("Alamat : "+this.alamat);
		System.out.println("Uang Tunjangan : Rp. "+this.uangTunjangan);
		System.out.println("Uang Transport : Rp. "+this.uangTransport);
		System.out.println("Gaji Pokok : Rp. "+this.gajiPokok);
		System.out.println("Total Gaji : Rp. "+totalGaji(this.uangTunjangan, this.uangTransport, this.gajiPokok));
	}
	
	public static void main (String[]args) {
		Gaji karyawan = new Gaji();
		
		karyawan.setNama("Rifki");
		karyawan.setAlamat("Pakansari");
		karyawan.setTunjangan(700000);
		karyawan.setTransport(700000);
		karyawan.setgajiPokok(700000);
		
		karyawan.data(
			karyawan.getNama(),
			karyawan.getAlamat(),
			karyawan.getTunjangan(),
			karyawan.getTranspor(),
			karyawan.getgajiPokok(),
			karyawan.gettotalGaji()
			
			);
			

	}
	
}
