package logic;

public class Triangular extends Prisma {
	
	float x1,y1,x3,y3;
	float base,h,lado1,lado2;

	public Triangular(float altura, float x1, float y1, float x3, float y3, float base, String nombre) {
		super(altura, nombre);
		this.x1 = x1;
		this.y1 = y1;
		this.x3 = x3;
		this.y3 = y3;
		this.base = base;
		this.h = y3-y1;
		this.lado1 = (float)(Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2)));
		this.lado2 = (float)(Math.sqrt(Math.pow(x3-(x1+base),2)+Math.pow(y3-y1,2)));
		super.figuraBase = "Triangulo";
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
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
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
		float al = (lado1+lado2+base)*altura;
		return al;
	}

	@Override
	public float areaBase() {
		float ab = ((base)*(h))/2;
		return ab;
	}

}
