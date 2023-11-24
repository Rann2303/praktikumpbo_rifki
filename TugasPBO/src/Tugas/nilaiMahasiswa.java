package Tugas;
//Ikbal Santosa (221106043021) - Regular A
//Rifki Adi Nugraha (221106043037) - Regular A
public class nilaiMahasiswa {
	private double quiz;
	private double uts;
	private double uas;
	
	public void setQuiz(double quiz) {
		this.quiz = quiz;
	}
	public double getQuiz() {
		return quiz;
	}
	public void setUts(double uts) {
		this.uts = uts;
	}
	public double getUts() {
		return uts;
	}
	public void setUas(double uas) {
		this.uas = uas;
	}
	public double getUas() {
		return uas;
	}
	
	public static void main(String[]args) {
		nilaiMahasiswa nilai = new nilaiMahasiswa();
		nilai.setQuiz(55.0);
		nilai.setUts(45.0);
		nilai.setUas(34.0);
		double NA = nilai.getQuiz()*20/100 + nilai.getUts()*30/100+nilai.getUas()*50/100;
		
		System.out.println("QUIZ : "+nilai.getQuiz());
		System.out.println("UTS : "+nilai.getUts());
		System.out.println("UAS : "+nilai.getUas()+"\n");
		System.out.println("Nilai Akhir : "+NA+"\n\n");
		
		if(NA >= 80 && NA <= 100) {
			System.out.println("Index = A");
			System.out.println("Keterangan = Sangat Baik");
		}else if(NA >= 68 && NA <= 80) {
			System.out.println("Index = B");
			System.out.println("Keterangan = Baik");
		}else if(NA >= 56 && NA <= 68) {
			System.out.println("Index = C");
			System.out.println("Keterangan = Cukup");
		}else if(NA >= 45 && NA <= 56) {
			System.out.println("Index = D");
			System.out.println("Keterangan = Kurang");
		}else if(NA >= 0 && NA <= 45) {
			System.out.println("Index = E");
			System.out.println("Keterangan = Sangat Kurang");
		}
		
	}
}
