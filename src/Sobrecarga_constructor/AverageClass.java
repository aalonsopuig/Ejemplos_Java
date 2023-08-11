package Sobrecarga_constructor;

public class AverageClass {

	private double media = 0;
	
	public AverageClass (double a, double b){
		media = (a+b)/2;
	}
	
	public AverageClass (double a, double b, double c){
		media =(a+b+c)/3;
	}

	public String getMedia () {
		return ("(Desde paquete Sobrecarga_constructor) " + media);
	}
}
