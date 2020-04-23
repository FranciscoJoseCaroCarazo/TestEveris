package Model;

public class Coche {
	
	private String color, marca, modelo;
	private int numpuertas, caballos;
	
	public Coche() {
		
	}
	
	public Coche(String color, String marca, String modelo, int numpuertas, int caballos) {
		
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.numpuertas = numpuertas;
		this.caballos = caballos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumpuertas() {
		return numpuertas;
	}

	public void setNumpuertas(int numpuertas) {
		this.numpuertas = numpuertas;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	@Override
	public String toString() {
		return "\ncolor = " + color + ", \nmarca = " + marca + ", \nmodelo = " + modelo + ", \nnumpuertas = " + numpuertas
				+ ", \ncaballos = " + caballos;
	}
	
	
	
	
}
