package com.prueba_fabrica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ContadorConsultas implements Serializable {

	@Id
	private int id;
	@GeneratedValue
	private long numConsulta;
	
	
	public ContadorConsultas(int id, long numConsulta) {
		super();
		this.id = id;
		this.numConsulta = numConsulta;
	}
	
	public ContadorConsultas() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNumConsulta() {
		return numConsulta;
	}

	public void setNumConsulta(long numConsulta) {
		this.numConsulta = numConsulta;
	}

	@Override
	public String toString() {
		return "ContadorConsultas [id=" + id + ", numConsulta=" + numConsulta + "]";
	}

	
}
