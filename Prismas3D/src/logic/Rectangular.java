package logic;

public class Rectangular extends Prisma {
	
	private float x1,y1,x2,y2,x3,y3;
	private float ladoA, ladob;

	public Rectangular(float altura, float x1, float y1, float x2, float y2, float x3, float y3) {
		super(altura);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.ladoA = super.distancia((x2-x3),(y2-y3));
		this.ladob = super.distancia((x2-x1),(y2-y1));
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
	public float getX2() {
		return x2;
	}
	public void setX2(float x2) {
		this.x2 = x2;
	}
	public float getY2() {
		return y2;
	}
	public void setY2(float y2) {
		this.y2 = y2;
	}
	public float getX3() {
		return x3;
	}
	public void setX3(float x3) {
		this.x3 = x3;
	}
	public float getY3() {
		return y3;
	}
	public void setY3(float y3) {
		this.y3 = y3;
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
