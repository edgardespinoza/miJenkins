package com.exe.main;

import com.exe.main.bean.Pais;

public class ProcesarImp implements IProcesar{

	@Override
	public long procesarSuma(int a, int b) {
		Pais p = new Pais();
		p.setNombre("nombre");
		p.setLocalidad("Localidad");
	    String g = (p.getLocalidad() + p.getLocalidad());
	    System.out.println(g);
		return (long)(a+b);
	}

}
