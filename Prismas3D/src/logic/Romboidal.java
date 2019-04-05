package logic;

public class Romboidal extends Prisma {
	
	private float x1,y1;
	private float lado,D,d;
	
	public Romboidal(float altura, float x1, float y1, float D, float d,  String nombre) {
		super(altura, nombre);
		this.x1 = x1;
		this.y1 = y1;
		this.lado = (float)(Math.sqrt(Math.pow(D/2,2)+Math.pow(d/2,2)));
		this.D = D;
		this.d = d;
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
