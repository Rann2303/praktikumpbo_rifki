package Tugas;

public class Kalkulator {
	private double Value1;
	private double Value2;
	
	public void setValue1(double value1) {
		this.Value1 = value1;
	}
	public double getValue1() {
		return Value1;
	}
	public void setValue2(double value2) {
		this.Value2 = value2;
	}
	public double getValue2() {
		return Value2;
	}
	
	public static void main(String[]args) {
		Kalkulator Value = new Kalkulator();
		Value.setValue1(7.0);
		Value.setValue2(5.0);
		System.out.println("Value 1 = "+Value.getValue1());
		System.out.println("Value 2 = "+Value.getValue2());
		
		System.out.println("Project Calculator");
		System.out.println("The project shown you how to manage method in java");
		
		double pertambahan = Value.getValue1()+Value.getValue2();
		double pengurangan = Value.getValue1()-Value.getValue2();
		double perkalian = Value.getValue1()*Value.getValue2();
		double pembagian = Value.getValue1()/Value.getValue2();
		
		System.out.println("Pertambahan = "+pertambahan);
		System.out.println("Pengurangan = "+pengurangan);
		System.out.println("Perkalian = "+perkalian);
		System.out.println("Pembagian = "+pembagian);
	}
}
