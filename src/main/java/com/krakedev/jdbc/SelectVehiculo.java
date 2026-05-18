package com.krakedev.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectVehiculo {
	private static final Logger log = LoggerFactory.getLogger(SelectVehiculo.class);
	private static final String URL = "jdbc:postgresql://localhost:5432/tallerjdbc";
	private static final String USER = "postgres";
	private static final String PASSWORD = "1004034391";

	public static void main(String[] args) {
		// realizamos conexion co la base de datos, lo inicializamos con null
		Connection con = null;
		// representa una sentencia sql preparada
		PreparedStatement ps;
		// ResultSet guarda las filas devueltas o importadas por el select
		ResultSet rs = null;

		try {

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
				int anio=rs.getInt("anio");
				double precio=rs.getDouble("precio");
				String color = rs.getString("color");
				boolean disponible=rs.getBoolean("disponible");



			}

		} catch (Exception e) {

		}

	}

}
