package TugasPraktikum;

public class Kalkulator {
	int angka1, angka2;
	
	public void setAngka1(int satu) {
		angka1 = satu; 	
	}
	
	public void setAngka2 (int dua) {
		angka2 = dua;
	}
	
	public int penjumlahan(int angkasatu, int angkadua) {
		angka1 = angkasatu;
		angka2 = angkadua;
		return angkasatu + angkadua;
	}
	
	public int pengurangan(int angkasatu, int angkadua) {
		angka1 = angkasatu;
		angka2 = angkadua;
		return angkasatu - angkadua;
	}
	
	public int perkalian(int angkasatu, int angkadua) {
		angka1 = angkasatu;
		angka2 = angkadua;
		return angkasatu * angkadua;
	}
	
	public int pembagian(int angkasatu, int angkadua) {
		angka1 = angkasatu;
		angka2 = angkadua;
		return angkasatu / angkadua;
	}
}
