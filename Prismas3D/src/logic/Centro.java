package logic;

import java.util.ArrayList;

import javax.swing.JFileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Centro implements Serializable {
	
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
	
	public void guardarDatos() throws IOException, ClassNotFoundException {

		String url = urlEjecutable();

		new File(url).mkdir();

		FileOutputStream foCentro = new FileOutputStream(url + "//MisDatos1.dat");
		ObjectOutputStream oosCentro = new ObjectOutputStream(foCentro);

		oosCentro.writeObject(centro);

		foCentro.close();

	}
	
	public void cargarDatos() throws IOException, ClassNotFoundException {

		String url = urlEjecutable();

		FileInputStream fiEmpresa = new FileInputStream(url + "//MisDatos1.dat");
		ObjectInputStream oisEmpresa = new ObjectInputStream(fiEmpresa);

		centro = (Centro) oisEmpresa.readObject();
		fiEmpresa.close();

	}
	
	public String urlEjecutable() {


		String url = new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "//Centro";

		return url;

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
