package logic;

public class Romboidal extends Prisma {
	
	private float x1,y1,x2,y2,x3,y3,x4,y4;
	private float lado,D,d;
	
	
	public Romboidal(float altura, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
		super(altura);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		this.lado = super.distancia((x1-x2),(y1-y2));
		this.D = super.distancia((x1-x3),(y1-y3));
		this.d = super.distancia((x2-x4),(y2-y4));
		super.figuraBase = "Rombo";
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
	public float getX4() {
		return x4;
	}
	public void setX4(float x4) {
		this.x4 = x4;
	}
	public float getY4() {
		return y4;
	}
	public void setY4(float y4) {
		this.y4 = y4;
	}
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	public float getD() {
		return D;
	}
	public void setD(float d) {
		D = d;
	}
	public float getd() {
		return d;
	}
	public void setd(float d) {
		this.d = d;
	}


	@Override
	public float areaLateral() {
		float al = 4*lado*altura;
		return al;
	}

	@Override
	public float areaBase() {
		float ab = ((D*d)/2);	
		return ab;
	}

}
