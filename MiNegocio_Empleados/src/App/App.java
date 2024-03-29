package App;

import java.util.Scanner;

import Maps.Empleado;
import Maps.Negocio;

public class App {
	
	static Negocio userBusiness;
	
	public static void boot() {
		Scanner userInput = createScannerForInput();
		if (firstBoot()) {
			giveWelcome();
			createABusiness(userInput);
			askForCommands(userInput);	
		} else {
			identifyBusiness();
			giveWelcomeBack();
			askForCommands(userInput);	
		}
		

	
	}
	
	private static Scanner createScannerForInput() {
		Scanner userInput = new Scanner(System.in);
		return userInput;
		
	}
	
	private static boolean firstBoot() {
		boolean firstBoolean = Controller.askManagerIfFirstBoot();
		return firstBoolean;
	}
	
	private static void giveWelcome() {
		System.out.println("************************************************************");
		System.out.println("¡BIENVENIDO A MINEGOCIO!");
		System.out.println("Esta aplicación de consola le permitirá generar y administrar una lista de los empleados que"
				+ " trabajan en su negocio, almacenada en un archivo TXT.");
		System.out.println("************************************************************");
	}
	
	private static void giveWelcomeBack() {
		System.out.println("************************************************************");
		System.out.println("¡BIENVENIDO NUEVAMENTE A MINEGOCIO!");
		System.out.println("El negocio anteriormente registrado se llama " + userBusiness.getNombre() + " y pertenece al rubro " + userBusiness.getRubro());
		System.out.println("************************************************************");
	}
	
	private static void createABusiness(Scanner userInput) {
		System.out.println("Usted no ha registrado un negocio aún. Por favor, responda las siguientes preguntas. Cuando desee enviar su respuesta, presione Enter.");
		System.out.println("¿Cuál es el nombre de su negocio?");
		String businessName = userInput.nextLine();
		
		System.out.println("¿A qué rubro pertenece su negocio?");
		String businessArea = userInput.nextLine();
		
		userBusiness = new Negocio(businessName, businessArea);
		Controller.askManagerForBusinessRegistration(userBusiness);
		System.out.println("¡Usted ha registrado su negocio exitosamente!");
		
	}
	
	private static void identifyBusiness() {
		userBusiness = Controller.askManagerForBusinessData();
		
	}
	
	private static void generateBusinessAutomatically() {
		
	}
	
	private static void askForCommands(Scanner userInput) {
		System.out.println("¿Qué operación desea realizar?");
		System.out.println("Presione 1 para ver los datos de su negocio");
		System.out.println("Presione 2 para registrar un nuevo empleado");
		System.out.println("Presione 3 para remover a un empleado de la lista");
		
		int answer = userInput.nextInt();
		userInput.nextLine();
		
		switch(answer) {
		case 1:
			showBusinessData();
			askForCommands(userInput);
			break;
		case 2:
			registerNewEmployee(userInput);
			askForCommands(userInput);
			break;
		case 3:
			deleteEmployee(userInput);
			askForCommands(userInput);
			break;
		}
		
	}
	
	private static void showBusinessData() {
		System.out.println(userBusiness.toString());
	}
	
	private static void registerNewEmployee(Scanner userInput) {
		System.out.println("Ingrese el nombre completo del empleado que desea registrar");
		String employeeName = userInput.nextLine();
		
		System.out.println("Ingrese el sector al que pertenece el empleado");
		String employeeArea = userInput.nextLine();
		
		System.out.println("Ingrese el número correspondiente a la categoría del empleado:");
		System.out.println("1. Trainee");
		System.out.println("2. Junior");
		System.out.println("3. Semi Senior");
		System.out.println("4. Senior");
		int employeeCategory = userInput.nextInt();
		
		System.out.println("Ingrese el sueldo del empleado:");
		double employeeSalary = userInput.nextDouble();
		
		Empleado newEmployee = new Empleado (employeeName, employeeArea, employeeCategory, employeeSalary);
		userBusiness.addEmployee(newEmployee);
		Controller.askManagerForBusinessRegistration(userBusiness);
		System.out.println("¡El empleado se ha registrado exitosamente!");
	}
	
	private static void deleteEmployee(Scanner userInput) {
		System.out.println("Ingrese el nombre del empleado que desea remover de la lista, tal cual se muestra en la misma");
		String employeeName = userInput.nextLine();
		
		userBusiness.deleteEmployee(employeeName);
		
		Controller.askManagerForBusinessRegistration(userBusiness);
		
		System.out.println("¡El empleado se ha removido exitosamente!");
		
	}

}
