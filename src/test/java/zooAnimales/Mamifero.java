package zooAnimales;
import java.util.ArrayList;


public class Mamifero extends Animal{
	private static  ArrayList<Mamifero> listado=new ArrayList<>();
	public static int caballos=0;
	public static int leones=0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		this(null,0,null,null,false,0);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje=pelaje;
		this.patas=patas;
		Mamifero.listado.add(this);
	}
	
	
	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado=listado;
	}
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje=pelaje;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas=patas;
	}
	public int getPatas() {
		return patas;
	}
	
	public int cantidadMamiferos() {
		return Mamifero.listado.size();
		
	}
	
	public static Mamifero crearCaballo(String nombre,int edad,String genero) {
		Mamifero Mamifero=new Mamifero(nombre,edad,"pradera",genero,true,4);
		caballos++;
		return Mamifero;
	}
	
	public static Mamifero crearLeon(String nombre,int edad,String genero) {
		Mamifero Mamifero=new Mamifero(nombre,edad,"selva",genero,true,4);
		leones++; 
		return Mamifero;
	}
	

}
