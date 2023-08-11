package Sobrecargas_y_enumerados;

public class AverageClass {

	private double media = 0;
	
	public AverageClass (double [] valores){
		for (double num:valores) {
			media+=num;
		}
		media=media/valores.length;
	}

	public AverageClass (double a, double b){
		media = (a+b)/2;
	}
	
	public String getMedia () {
		return ("(Desde paquete Sobrecargas_y_enumerados) " + media);
	}
}
