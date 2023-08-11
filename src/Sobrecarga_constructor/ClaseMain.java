package Sobrecarga_constructor;


public class ClaseMain {

	public static void main(String[] args) {
			
		AverageClass Media1 = new AverageClass(4.2, 2.5);
		AverageClass Media2 = new AverageClass(4,8.7,3);
		System.out.println(Media1.getMedia());
		System.out.println(Media2.getMedia());
	}
}
