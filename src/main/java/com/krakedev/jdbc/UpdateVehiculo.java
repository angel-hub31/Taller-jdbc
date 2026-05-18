package com.krakedev.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
					UPDATE Vehiculos SET marca=?,modelo=?,anio=?,precio=?,color=?,kilometraje=?,disponible=?
					WHERE placa=?
					""";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, "Kia");
			ps.setString(2, "Cerato");
			ps.setInt(3, 2025);
			ps.setDouble(4, 18000);
			ps.setString(5, "Vinotinto");
			ps.setInt(6, 450);
			ps.setBoolean(7, true);
			ps.setString(8, "PBN789");
			
			int fila=ps.executeUpdate();
			log.info("-----Vehiculo actualizado-----");
			log.info("filas afectadas: " + fila);
			//capturamos exepciones
		}catch(Exception e){
			log.error("Error al actualizar: " +e.getMessage());
			
			
		}finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
				
			} catch (SQLException e) {
				log.error("Error al cerrar los recursos: " + e.getMessage());
			}
		}

	}

}
