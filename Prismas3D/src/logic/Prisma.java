package logic;

public abstract class Prisma {
	
	protected float altura;
	protected String figuraBase;
	
	public Prisma(float altura) {
		super();
		this.altura = altura;
	}
	
	//Setters and getters
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getfiguraBase() {
		return figuraBase;
	}

	public void setfiguraBase(String base) {
		this.figuraBase = base;
	}

	//metodos poliformicos
	public float volumen() {
		float vol = areaBase() * altura;
		return vol;
	}
	
	public float distancia(float x, float y) {
		float D = (float)(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
		return D;
	}
	public float areaTotal() {
		float at = 2*areaBase() + areaLateral();
		return at;
	}
	
	//Abstract methods for childs
	public abstract float areaLateral();
	public abstract float areaBase();
}
