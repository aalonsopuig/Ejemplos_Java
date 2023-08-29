package Genericidad;

public class Pair<T> {	      //Clase genérica
    private T left, right;	      //Variables genericas
    public Pair(T left, T right) { //Constructor
    	this.left = left;
    	this.right = right;
    }
    public T getLeft() {return left;}
    public T getRight() {return right;}

    public void printArray(T[] array) {
	   for (T item:array) {
	      System.out.println(item);
	   }
    }

	public static void main(String[] args) {
      Pair<Integer> i = new Pair(1,2);
      Pair<String> s = new Pair("hello", "world");
      Pair<Float> f = new Pair(1,2);
  
      System.out.println(i.getLeft());
      System.out.println(s.getRight());
      System.out.println(f.getRight());
      
		Integer[] arr = {6,4,5};
		i.printArray (arr);
	 
	}

}
