package br.com.fiap.globalsolution.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {


        
    	public Connection DBConnectionManager() throws ClassNotFoundException, SQLException {
    		
    		String dbURL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    		String user = "rm85164";
    		String pwd = "210693";
    		
    		//utilizando o ClassForName para aplicações Web
    		Class.forName("oracle.jdbc.OracleDriver");
    		
    		return DriverManager.getConnection(dbURL,user,pwd);
    	}
    
}