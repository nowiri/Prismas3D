package logic;

import java.util.ArrayList;

import javax.swing.JFileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Centro implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5635111080934618090L;
	/**
	 * 
	 */

	private ArrayList<Prisma> misPrismas;
	private ArrayList<Users> misUsuarios;
	private static Centro centro;
	private static Users loginUser;
	public static boolean firstTime = true;
	
	public Centro() {
		misPrismas = new ArrayList<>();
		misUsuarios = new ArrayList<>();
	}
	
	public static Centro getInstance() {
		if(centro == null) {
			centro = new Centro();
		}
		
		return centro;
	}
	
	public static void setInstance(Centro cent) {
		System.out.println("si");
		centro = cent;
	}
	
	
	public static Users getLoginUser() {
		return loginUser;
	}

	public static void setLoginUser(Users loginUser) {
		Centro.loginUser = loginUser;
	}
	
	
	public ArrayList<Prisma> getMisPrismas() {
		return misPrismas;
	}

	public void setMisPrismas(ArrayList<Prisma> misPrisma) {
		this.misPrismas = misPrisma;
	}

	public ArrayList<Users> getMisUsuarios() {
		return misUsuarios;
	}

	public void setMisUsuarios(ArrayList<Users> misUsuario) {
		misUsuarios = misUsuario;
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

	public static void leer() {
		
	}

}
