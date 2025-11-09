package Actividad;

public class Empleado {
	private String nombre, apellidos, otrosIngresos, pagoSeguridadSocial, genero, pueblo,salario, IRPF;
	Empleado(){
		
	}
	Empleado(String name, String surname, String town, String genre, String Salary, String SS, String IRP, String other) {
		this.nombre = name; this.apellidos = surname; this.pueblo = town; this.genero = genre; 
		this.salario = Salary; this.pagoSeguridadSocial = SS; this.IRPF = IRP; this.otrosIngresos = other;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getOtrosIngresos() {
		return otrosIngresos;
	}
	public void setOtrosIngresos(String otrosIngresos) {
		this.otrosIngresos = otrosIngresos;
	}
	public String getPagoSeguridadSocial() {
		return pagoSeguridadSocial;
	}
	public void setPagoSeguridadSocial(String pagoSeguridadSocial) {
		this.pagoSeguridadSocial = pagoSeguridadSocial;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPueblo() {
		return pueblo;
	}
	public void setPueblo(String pueblo) {
		this.pueblo = pueblo;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getIRPF() {
		return IRPF;
	}
	public void setIRPF(String iRPF) {
		IRPF = iRPF;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre +"\n" + "apellidos=" + apellidos +"\n" +  "otrosIngresos=" + otrosIngresos
				+"\n" +  "pagoSeguridadSocial=" + pagoSeguridadSocial +"\n" +  "genero=" + genero +"\n" +  "pueblo=" + pueblo
				+"\n" +  "salario=" + salario +"\n" +  "IRPF=" + IRPF;
	}
	
}
