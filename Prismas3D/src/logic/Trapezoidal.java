package logic;

public class Trapezoidal extends Prisma {
	
	float x1,y1,x2,y2,x3,y3,x4,y4;
	float baseMenor, baseMayor,h,lado1,lado2;

	public Trapezoidal(float altura, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
		super(altura);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		this.baseMayor = super.distancia((x3-x4),(y3-y4));
		this.h = super.distancia((x1-x1),(y1-y3));
		this.baseMenor = super.distancia((x1-x2),(y1-y2));
		this.lado1 = super.distancia((x1-x3),(y1-y3));
		this.lado2 = super.distancia((x2-x4),(y2-y4));
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
	public float getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}
	public float getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(float baseMayor) {
		this.baseMayor = baseMayor;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	public float getLado1() {
		return lado1;
	}
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}
	public float getLado2() {
		return lado2;
	}
	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}



	@Override
	public float areaLateral() {
		float al = (lado1+lado2+baseMenor+baseMayor)*altura;
		return al;
	}

	@Override
	public float areaBase() {
		float ab = ((baseMayor+baseMenor)/2)*h;
		return ab;
	}

}
