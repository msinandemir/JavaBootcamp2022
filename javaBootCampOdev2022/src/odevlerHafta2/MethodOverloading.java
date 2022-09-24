package odevlerHafta2;

public class MethodOverloading {

	public static void main(String[] args) {
		topla(2,4);
		topla(3,4,5);

	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	public static int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}

}
