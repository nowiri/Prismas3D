package logic;

import java.io.Serializable;
import java.util.ArrayList;

public class ControlUsuarios implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Users> misUsers;
	private static ControlUsuarios control;
	private static Users loginUser;
	private static boolean firstTime;
	
	private ControlUsuarios() {
		misUsers = new ArrayList<>();
	}
	
	public static ControlUsuarios getInstance(){
		if(control == null){
			control = new ControlUsuarios();
		}
		return control;
	}

	public ArrayList<Users> getMisUsers() {
		return misUsers;
	}

	public void setMisUsers(ArrayList<Users> misUsers) {
		this.misUsers = misUsers;
	}

	public static ControlUsuarios getControl() {
		return control;
	}

	public static void setControl(ControlUsuarios control) {
		ControlUsuarios.control = control;
	}

	public static Users getLoginUser() {
		return loginUser;
	}

	public static void setLoginUser(Users loginUser) {
		ControlUsuarios.loginUser = loginUser;
	}

	public void Principal(Users user) {
		misUsers.add(user);
		
	}

	public static boolean isFirstTime() {
		return firstTime;
	}

	public static void setFirstTime(boolean firstTime) {
		ControlUsuarios.firstTime = firstTime;
	}
	

	public boolean confirmLogin(String text, String text2) {
		boolean login = false;
		for (Users user : misUsers) {
			if(user.getUserName().equals(text)){
				loginUser = user;
				login = true;
			}
		}
		return login;
	}

}
