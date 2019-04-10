package logic;

import java.util.ArrayList;

public class Centro {
	
	public static ArrayList<Prisma> misPrismas = new ArrayList<>();
	public static ArrayList<Users> misUsuarios = new ArrayList<>();
	private static Centro centro;
	private static Users loginUser;
	
	public static Centro getInstance() {
		if(centro == null) {
			centro = new Centro();
		}
		
		return centro;
	}
	
	public static void setInstance(Centro cent) {
		centro = cent;
	}
	
	
	public static Users getLoginUser() {
		return loginUser;
	}

	public static void setLoginUser(Users loginUser) {
		Centro.loginUser = loginUser;
	}
	
	public void addPrisma(Prisma prisma) {
		misPrismas.add(prisma);
	}
	
	public void addUser(Users user) {
		misUsuarios.add(user);
	}

	public boolean login(String usuario, String pass) {
		boolean login = false;
		
		for(Users user : misUsuarios) {
			if(user.getUserName().equals(usuario)) {
				if(user.getPass().equals(pass)) {
					login = true;
					loginUser = user;
				}
			}
		}
		
		return login;
	}

}
