package logic;

public class Main {

	public static void main(String[] args) {
		Cuadrangular C1 = new Cuadrangular(3f,4f,4f,4f,2f);
	//	System.out.println(C1.areaBase());
		
		Rectangular R1 = new Rectangular(4f, 2f, 2f, 2f, 1f, 8f, 1f);
	//	System.out.println(R1.volumen());
		
		Romboidal r1 = new Romboidal(3f,0f,4f,4f,2f,8f,4f,4f,6f);
	//	System.out.println(r1.getLado());
		
		Triangular t1 = new Triangular(3f,2f,2f,6f,2f,3f,4f);
		System.out.println(t1.areaLateral());
	}

}
