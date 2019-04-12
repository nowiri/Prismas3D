package logic;

public class Cuadrangular extends Prisma {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -296027855736122143L;
	/**
	 * 
	 */

	private float x1,y1;
	private float lado;
	
	public Cuadrangular(float altura, float x1, float y1, float lado, String nombre) {
		super(altura,nombre);
		this.x1 = x1;
		this.y1 = y1;
		this.lado = lado;
		super.figuraBase = "Cuadrado";
	}

	public float getX1() {
		return x1;
	}
	public void setX1(float x1) {
		this.x1 = x1;
	}
	public float getY1() {
		return y1;
	}
	public void setY1(float y1) {
		this.y1 = y1;
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
