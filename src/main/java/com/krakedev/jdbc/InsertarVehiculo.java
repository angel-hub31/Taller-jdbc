package com.krakedev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertarVehiculo {
	
	private static final Logger log =LoggerFactory.getLogger(InsertarVehiculo.class);
	private static final String URL="jdbc:postgresql://localhost:5432/tallerjdbc";
	private static final String USER="postgres";
	private static final String PASSWORD ="1004034391";

	public static void main(String[] args) {
		// realizamos conexion co la base de datos, lo inicializamos con null
		Connection con =null;
		//representa una sentencia sql preparada
		PreparedStatement ps=null;
		
		//sentencias SQL
		String sql=""" 
				
				INSERT INTO vehiculos(placa, marca, modelo, anio, precio, color, kilometraje, disponible)
				VALUES (?,?,?,?,?,?,?,?)
				""";
		
		try {
			con = Conexion.getConnection();
			ps=con.prepareStatement(sql);
			//seteamos la primera columna, en este caso es la columna placa
			ps.setString(1, "PUB715");
			//seteamos la segunda columna, en este caso es la columna marca
			ps.setString(2, "Chevrolet");
			//seteamos la tercera columna, en este caso es la columna modelo
			ps.setString(3, "Onix");
			//seteamos la cuarta columna, en este caso es la columna anio
			ps.setInt(4, 2024);
			//seteamos la quinta columna, en este caso es la columna precio
			ps.setDouble(5, 18000);
			//seteamos la sexta columna, en este caso es la columna color
			ps.setString(6, "Blanco");
			//seteamos la septima columna, en este caso es la columna kilometraje
			ps.setInt(7, 300);
			//seteamos la octava columna, en este caso es la columna disponible
			ps.setBoolean(8, true);
			
			//devuelve las filas afectadas filas fueron afectadas
			
			int filas=ps.executeUpdate();
			
			log.info("-----Vehiculo Agregado------");
			
			log.info("Filas insertadas: "+ filas);
			
		}catch(SQLException e) {
			
			log.error("error en la conexion: " + e.getMessage());
			
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
