package Sobrecargas_y_enumerados;


//import Sobrecarga_constructor.AverageClass;

public class ClaseMain {

	public static void main(String[] args) {

		//PARTE DEL C�DIGO QUE CALCULA MEDIAS
		Sobrecarga_constructor.AverageClass Media1 = new Sobrecarga_constructor.AverageClass(4,2);
		Sobrecarga_constructor.AverageClass Media2 = new Sobrecarga_constructor.AverageClass(4,8,9);
		
		double [] valores = {4,8,9,6};
		AverageClass Media3 = new AverageClass(valores);
		AverageClass Media4 = new AverageClass(4,2);
		
		System.out.println(Media1.getMedia()); //Corresponde al paquete "Sobrecarga_constructor"
		System.out.println(Media2.getMedia()); //Corresponde al paquete "Sobrecarga_constructor"
		System.out.println(Media3.getMedia()); //Corresponde al paquete "Sobrecargas_y_enumerados"
		System.out.println(Media4.getMedia()); //Corresponde al paquete "Sobrecargas_y_enumerados"
		
		//PARTE DEL C�DIGO QUE USA ENUMERADOS
		Semana claseIngles;
		claseIngles = Semana.MARTES;
		if ((claseIngles != Semana.S�BADO) && (claseIngles != Semana.DOMINGO)){
			System.out.println("D�a de trabajo");
		}

	}
}

