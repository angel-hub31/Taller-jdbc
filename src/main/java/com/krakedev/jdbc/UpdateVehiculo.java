package com.krakedev.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateVehiculo {
	private static final Logger log = LoggerFactory.getLogger(UpdateVehiculo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con= null;
		PreparedStatement ps = null;
		
		try {
			//realizamos la conexion
			con=Conexion.getConnection();
			//realizamos las actualizaciones
			String sql="""
					UPDATE Vehiculo SET marca=?,modelo=?,anio=?,precio=?,color=?,disponible=?
					WHERE placa=?
					""";
			
			
			//capturamos exepciones
		}catch(Exception e){
			
		}

	}

}
