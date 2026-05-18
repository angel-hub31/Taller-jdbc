package com.krakedev.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectVehiculo {
	private static final Logger log = LoggerFactory.getLogger(SelectVehiculo.class);

	public static void main(String[] args) {
		// realizamos conexion co la base de datos, lo inicializamos con null
		Connection con = null;
		// representa una sentencia sql preparada
		PreparedStatement ps = null;
		// ResultSet guarda las filas devueltas o importadas por el select
		ResultSet rs = null;

		try {
			// llamamos a nuestro metodo Connection de nuestra clase Conexion
			// y llamamos al metodo statico
			con = Conexion.getConnection();
			// sentencias SQL
			String sql = """
					SELECT * FROM vehiculos
					""";
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

			// recorremos con el while que nos devuelve V o F en funcion de si hay mas filas
			while (rs.next()) {
				String placa = rs.getString("placa");
				String marca = rs.getString("marca");
				String modelo = rs.getString("modelo");
				int anio = rs.getInt("anio");
				double precio = rs.getDouble("precio");
				String color = rs.getString("color");
				int kilometraje=rs.getInt("kilometraje");
				boolean disponible = rs.getBoolean("disponible");
				
				log.info("");

				log.info("Vehiculo: Placa: " + placa + " Marca: " + marca + " Modelo: " + modelo + " Anio: " + anio
						+ " Precio: " + precio + " Color: " + color + " Kilometraje: "+ kilometraje+" Disponible: " + disponible);

			}

		} catch (Exception e) {
			log.error("error al traer datos", e.getMessage());

		} finally {
			try {
				if(rs !=null) {
					rs.close();
				}
				if (ps !=null) {
					ps.close();
				}
				if(con !=null) {
					con.close();
}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				log.error("Error al cerrar los recursos: " + e.getMessage());
			}
		}

	}

}
