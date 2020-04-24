package Operations;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import Model.Coche;
import Operations.Excepciones;

public class helper {
	
	static HashMap<Integer, Coche> lista = new HashMap<Integer, Coche>(10);
	static Excepciones ex = new Excepciones();
	static Scanner sc = new Scanner(System.in);
	
	public static void Menuprincipal() throws IOException {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("==========================================");
			System.out.println("========= Gestión de Coches =========");
			System.out.println("==========================================");
			System.out.println();
			System.out.println("1.-Crear Coche.");
			System.out.println("2.-Listar Coches.");
			System.out.println("3.-Borrar un Coche.");
			System.out.println();
			System.out.println("0.-Salir de la aplicacion.");
			System.out.println("==========================================");
			System.out.println("Introduzca la opcion elegida");

			opcion = ex.controlInt();
			switch (opcion) {
			case 1:
				aniadirVideojuego();
				break;
			case 2:
				leerlista();
				break;
			case 3:
				borrarVideojuego();
				break;
			case 0:
				System.out.println("Saliendo del Programa");
				break;
			default:
				System.out.println("Por favor seleccione una opcion del 0-5");
				break;
			}

		} while (opcion != 0);
	}
	
	public static void aniadirVideojuego() throws IOException {
		Coche coche = new Coche();
		System.out.println("------------Creacion de Coche -----------");
		System.out.println("");
		System.out.println("Introduzca el Color del coche");
		coche.setColor(ex.textosinnumeros(sc.nextLine()));
		System.out.println("Introduzca la marca del coche");
		coche.setMarca(ex.textosinnumeros(sc.nextLine()));
		System.out.println("Introduzca el modelo del coche");
		coche.setModelo(ex.textosinnumeros(sc.nextLine()));
		System.out.println("Introduzca el nummero de puertas del coche");
		coche.setNumpuertas(ex.controlInt());
		System.out.println("Introduzca los caballos del coche del coche");
		coche.setCaballos(ex.controlInt());
		lista.put(saber_id() + 1, coche);
		System.out.println("Se ha creado un Coche");
		
	}
	
	public static void leerlista() throws IOException {
		if (lista.isEmpty()) {
			System.out.println("No existe ningun coche");
		} else {
			lista.entrySet().stream()
					.forEach(e -> System.out.println("\n<--------Coche-------->\nCodigo de Coche: " + e));
		}
		System.out.println("");
		System.out.println("Se han mostrado " + lista.size() + " coches");

	}
	
	public static void borrarVideojuego() throws IOException {
		if (lista.isEmpty()) {
			System.out.println("No existe ningun Coche");
		} else {
			System.out.println("Introduzca el id del Coche a borrar");
			System.out.println("");
			Integer buscar = ex.controlInt();
			if (lista.containsKey(buscar)) {
				System.out.println("\n<--------Coche-------->\nCodigo de Coche: " + lista.get(buscar));
				System.out.println("\n\n¿Deseea continuar con el borrado? S/N");
				String confirmar = ex.textosinnumeros(sc.nextLine());
				if (confirmar.equalsIgnoreCase("S")) {
					lista.remove(buscar);
				} else if (confirmar.equalsIgnoreCase("N")) {
					System.out.println("Cancelando Operacion");
				} else {
					System.out.println("Introduzca la opcion correcta");
				}

			} else {
				System.out.println("El ID introducido no es correcto por favor introduzca un ID valido");
			}
		}

	}
	
	public static Integer saber_id() {
		Set<Integer> keys = lista.keySet();
		Integer mayor = 0;
		for (Integer key : keys) {
			if (key >= mayor) {
				mayor = key;
			}

		}

		return mayor;
	}
}
