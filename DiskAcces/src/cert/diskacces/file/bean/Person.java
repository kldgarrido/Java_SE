package cert.diskacces.file.bean;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 2409821563777450156L;

	private String name;
	private int edad;

	public Person(String name, int edad) {
		super();
		this.name = name;
		this.edad = edad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", edad=" + edad + "]";
	}
	
}
