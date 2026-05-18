package com.krakedev.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeleteVehiculo {
	private static final Logger log = LoggerFactory.getLogger(DeleteVehiculo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con= null;
		PreparedStatement ps = null;
		
		try {
			con=Conexion.getConnection();
			String sql="DELETE FROM Vehiculos WHERE placa=?";
			
			ps=con.prepareStatement(sql);
			ps.setString(1, "PBN789");
			
			int filas=ps.executeUpdate();
			log.info("---Vehiculo Eliminado Exitoso---");
			log.info("Filas eliminadas: " + filas);
			
			
		}catch(Exception e) {
			log.error("error al eliminar filas:" + e.getMessage());

			
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
