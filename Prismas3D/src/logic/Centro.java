package logic;

import java.util.ArrayList;

public class Centro {
	
	public static ArrayList<Prisma> misPrismas = new ArrayList<>();
	private static Centro centro;
	
	public static Centro getInstance() {
		if(centro == null) {
			centro = new Centro();
		}
		
		return centro;
	}
	
	public void addPrisma(Prisma prisma) {
		misPrismas.add(prisma);
	}

}
