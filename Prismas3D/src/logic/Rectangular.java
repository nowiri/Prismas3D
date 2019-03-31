package logic;

public class Rectangular extends Prisma {
	
	private float x1,y1;
	private float ladoA, ladob;

	public Rectangular(float altura, float x1, float y1, float ladoA, float ladoB) {
		super(altura);
		this.x1 = x1;
		this.y1 = y1;
		this.ladoA = ladoA;
		this.ladob = ladoB;
		super.figuraBase = "Rectángulo";		
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
	
	public float getLadoA() {
		return ladoA;
	}
	public void setLadoA(float ladoA) {
		this.ladoA = ladoA;
	}
	public float getLadob() {
		return ladob;
	}
	public void setLadob(float ladob) {
		this.ladob = ladob;
	}
	
	@Override
	public float areaLateral() {
		float al = (2*ladoA + 2*ladob)*altura;
		return al;
	}

	@Override
	public float areaBase() {
		float ab = ladoA*ladob;
		return ab;
	}

}
