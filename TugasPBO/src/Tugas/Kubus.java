package Tugas;

// Ikbal Santosa (221106043021) - Regular A
// Rifki Adi Nugraha (221106043037) - Regular A
public class Kubus {
	private int Sisi;
	private int Massa;
	
	public void setSisi(int sisi) {
		this.Sisi = sisi;
	}
	public void setMassa(int massa) {
		this.Massa = massa;
	}
	public int getSisi() {
		return Sisi;
	}
	public int getMassa() {
		return Massa;
	}
	public int hitungVolume(int parSisi) {
		this.Sisi = parSisi;
		return parSisi * parSisi * parSisi;
	}
	public int hitungMassaJenis(int parMassa, int volume) {
		volume = hitungVolume(this.getSisi());
		parMassa = this.getMassa()/volume;
		return parMassa;
	}
	public static void main(String[]args) {
		Kubus kubus = new Kubus();
		kubus.setSisi(5);
		kubus.setMassa(250);
		System.out.println("===== Massa Jenis Kubus =====");
		System.out.println("Sisi : "+kubus.getSisi());
		System.out.println("Massa : "+kubus.getMassa()+"\n\n");
		System.out.println("===== Hasil Perhitungan =====");
		System.out.println("Volume : "+kubus.hitungVolume(kubus.getSisi()));
		System.out.println("Massa Jenis : "+kubus.hitungMassaJenis(kubus.hitungVolume(kubus.getSisi()), kubus.getMassa()));
	}
}
