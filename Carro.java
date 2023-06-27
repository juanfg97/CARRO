package clases;
import java.util.Scanner;
public class Carro {
	private String marca;
	private int modelo;
	private double motor;
	private String tipo_combustible;
	private String tipo_automovil;
	private int numero_puertas;
	private int cantidad_asientos;
	private int velocidad_max;
	private String color;
	private int velocidad_actual;
	

	public Carro(String marca,int modelo, double motor,String tipo_combustible,
			String tipo_automovil,int numero_puertas,int cantidad_asientos,
		int velocidad_max,String color , int velocidad_actual)
	{
	
		this.marca=marca;
		this.modelo=modelo;
		this.motor=motor;
		this.tipo_combustible=tipo_combustible;
		this.tipo_automovil=tipo_automovil;
		this.numero_puertas=numero_puertas;
		this.cantidad_asientos=cantidad_asientos;
		this.velocidad_max=velocidad_max;
		this.color=color;
		this.velocidad_actual=velocidad_actual;
	}
	public void Setmarca(String marca) {
		this.marca=marca;
	}
	public String Getmarca() {
		return marca;
	}
	public void Setmodelo(int modelo) {
		this.modelo=modelo;
	}
	public int Getmodelo() {
		return modelo;
	}
	public void Setmotor(double motor) {
		this.motor=motor;
	}
	public double Getmotor() {
		return motor;
	}
	public void Settipo_combustible(String tipo_combustible) {
		this.tipo_combustible=tipo_combustible;
	}
	public String Gettipo_combustible() {
		return tipo_combustible;
	}
	public void Settipo_automovil(String tipo_automovil) {
		this.tipo_automovil=tipo_automovil;
	}
	public String Gettipo_automovil() {
		return tipo_automovil;
	}
	public void Setnumero_puertas(int numero_puertas) {
		this.numero_puertas=numero_puertas;
	}
	public int Getnumero_puertas() {
		return numero_puertas;
	}
	public void Setcantidad_asientos(int cantidad_asientos) {
		this.cantidad_asientos=cantidad_asientos;
	}
	public int Getcantidad_asientos() {
		return cantidad_asientos;
	}
	public void Setvelocidad_max(int velocidad_max) {
		this.velocidad_max=velocidad_max;
	}
	public int Getvelocidad_max() {
		return velocidad_max;
	}
	public void Setcolor(String color) {
		this.color=color;
	}
	public String Getcolor() {
		return color;
	}
	
	public void Setvelocidad_actual(int velocidad_actual) {
		this.velocidad_actual=velocidad_actual;
	}
	public int Getvelocidad_actual() {
		return velocidad_actual;
	}
	void acelerar() {
		int a=20;
		velocidad_actual=velocidad_actual + a;
		System.out.println("El carro acelera");
		System.out.println("Velocidad actual: "+velocidad_actual+"km/h");
	}
	void desacelerar() {
		int da=50;
		velocidad_actual=velocidad_actual - da;
		System.out.println("El carro desacelera");
		System.out.println("Velocidad actual: "+velocidad_actual+"km/h");
	}
	void frenar() {
		int f=velocidad_actual;
		velocidad_actual=velocidad_actual-f;
		System.out.println("El carro frena");
		System.out.println("Velocidad actual: "+velocidad_actual+"km/h");
	}
	void tiempo_llegada() {
		System.out.println("Ingrese la distancia a recorrer");
		Scanner read= new Scanner (System.in);
		int d;
		d=read.nextInt();
		double t;
		velocidad_actual=100;
		t=d/velocidad_actual;
		System.out.println("El tiempo estimado para llegar a su destino es de "+t+" horas");
		
	}
	void imprimir() {
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Motor: "+motor+"l");
		System.out.println("Tipo de combustible: "+tipo_combustible);
		System.out.println("Tipo de automovil: "+tipo_automovil);
		System.out.println("Numero de puertas: "+numero_puertas);
		System.out.println("Cantidad de asientos: "+cantidad_asientos);
		System.out.println("Velocidad maxima: "+velocidad_max+"km/h");
		System.out.println("Color: "+color);
		System.out.println("Velocidad actual: "+velocidad_actual+"km/h");
	}
	

	public static void main(String[] args) {
	Carro c1 =new Carro ("Toyota",2010,2.5,"gasolina","carro de ciudad",4,5,180,"azul",100);
	c1.imprimir();
	c1.tiempo_llegada();
	c1.acelerar();
	c1.desacelerar();
	c1.frenar();
	}

}
