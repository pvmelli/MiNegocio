package App;

import Maps.Empleado;
import Maps.Negocio;

public class Controller {
	
	public static boolean askManagerIfFirstBoot() {
		boolean isFirstBoot = FileManager.searchForBusinessFile();
		return isFirstBoot;
	}
	
	public static void askManagerForBusinessRegistration(Negocio myBusiness) {
		FileManager.writeBusinessFile(myBusiness);
	}
	
	public static Negocio askManagerForBusinessData() {
		return FileManager.readBusinessSer();

	}
	
}
