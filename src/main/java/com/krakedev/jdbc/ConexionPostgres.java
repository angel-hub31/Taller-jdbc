package com.krakedev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionPostgres {
	private static final Logger log = LogManager.getLogger(ConexionPostgres.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con=null;
		
		try {
			con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/tallerjdbc","postgres","1004034391");
			log.info("conexion exitosa");
			
		}catch(SQLException e) {
			
			log.error("error de conexion: " + e.getMessage());
			
			//cerramos la conexion
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
