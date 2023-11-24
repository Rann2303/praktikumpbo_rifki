package Tugas;
//Ikbal Santosa (221106043021) - Regular A
//Rifki Adi Nugraha (221106043037) - Regular A
public class HukumOhm {
    double kuatArus;
    double hambatan;

    public double getkuatArus() {
    	return kuatArus = 3.0;
    }
    public double getHambatan() {
    	return hambatan = 12.0;
    }

    double hitungTegangan() {
        return kuatArus * hambatan;
    }

    void tampilkanHasil() {
        System.out.println("======Hukum Ohm======");
        System.out.println("Buat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan bede potensial pada ujung-ujung kawat penghantar tersebut asalkan "
        		+ "suhu kawat dijaga konstan.\n");
        System.out.println("Kuat Arus: " + getkuatArus() + " ampere");
        System.out.println("Hambatan: " + getHambatan() + " ohm");
        System.out.println("Hasil Tegangan: " + hitungTegangan() + " volt");
    }

    public static void main(String[] args) {
        HukumOhm hukumOhm = new HukumOhm();
        hukumOhm.tampilkanHasil();
    }
}
