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
			ps=con.prepareStatement(sql);
			
			ps.setString(1, "Ford");
			ps.setString(2, "Xplorer");
			ps.setInt(3, 2021);
			ps.setDouble(4, 30000);
			ps.setString(5, "Negro");
			ps.setBoolean(6, true);
			ps.setString(7, "PSG-123");
			
			int fila=ps.executeUpdate();
			log.info("filas afectadas: " + fila);
			//capturamos exepciones
		}catch(Exception e){
			log.error("Error al actualizar: " +e.getMessage());
			
			
		}

	}

}
