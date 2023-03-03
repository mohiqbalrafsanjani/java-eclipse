package CodeAcademy;

public class HelloWorld{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String Nama = "iqbal";
		System.out.println(Nama);
		int Angka = 11;
		System.out.println(Angka);
		System.out.println("Hello " + Nama);
		System.out.println("nomor " + Angka);
		int Angka2 = 22;
		System.out.println(Angka + Angka2);
		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);
		boolean isFun = true;
		System.out.println(isFun);
		System.out.println("");
		int x = 5;
		int y = 3;
		System.out.println(x>y);
		String txt = "html css javascript python java";
		System.out.println(txt.indexOf("css"));
		String Greet = "Hello, ";
		String Intro = "I am Jarvis";
		System.out.println(Greet + "" + Intro);
		System.out.println(Greet.concat(Intro));
		String Viking = "We are the so-called \"Vikings\" from the north.";
		System.out.println(Viking);
		System.out.println(Math.max(x, y));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.random());
		System.out.println(Math.abs(-4.8));
		
		//ternary operator
		int z = (x>y) ? 13:3;
		System.out.println(z);
		
		while (z > 0) {
			System.out.println("number " + z);
			z--;
		}
		
		do {
			System.out.println("number " + z);
			z++;
		}
		while(z <= 13);
		
		//java multi dimensional arrays
		int[][] myNumber = {{1,2,3,4},{5,6,7}};
		System.out.println(myNumber[1][2]);
		
		System.out.println(myNumber[0][1]);
	}
}