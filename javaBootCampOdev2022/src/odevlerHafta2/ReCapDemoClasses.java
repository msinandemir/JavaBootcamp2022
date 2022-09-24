package odevlerHafta2;

public class ReCapDemoClasses {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int islem1 = dortIslem.bol(5, 1);
		int islem2 = dortIslem.carp(10, 3);
		int islem3 = dortIslem.topla(3, 5);
		int islem4 = dortIslem.cikar(12, 9);
		System.out.println(islem1 + " " + islem2 + " " + islem3 + " " + islem4);

	}

}
