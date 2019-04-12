package logic;

public abstract class Prisma {
	
	protected float altura;
	protected String figuraBase;
	protected String nombre;
	
	public Prisma(float altura, String nombre) {
		super();
		this.altura = altura;
		this.nombre = nombre;
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
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//metodos poliformicos
	public float volumen() {
		float vol = areaBase() * altura;
		return vol;
	}

	public float areaTotal() {
		float at = 2*areaBase() + areaLateral();
		return at;
	}
	
	//Abstract methods for childs
	public abstract float areaLateral();
	public abstract float areaBase();
}
