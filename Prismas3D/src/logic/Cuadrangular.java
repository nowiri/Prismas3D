package logic;

public class Cuadrangular extends Prisma {
	
	private float x1,x2;
	private float lado;
	
	public Cuadrangular(float altura, float x1, float y1, float lado, String nombre) {
		super(altura,nombre);
		this.x1 = x1;
		this.x2 = x2;
		this.lado = lado;
		super.figuraBase = "Cuadrado";
	}

	public float getX1() {
		return x1;
	}
	public void setX1(float x1) {
		this.x1 = x1;
	}
	public float getX2() {
		return x2;
	}
	public void setX2(float x2) {
		this.x2 = x2;
	}
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public float areaLateral() {
		float aL = 4*lado*altura;
		return aL;
	}

	@Override
	public float areaBase() {
		float ab = (float)Math.pow(lado,2);
		return ab;
	}

}
