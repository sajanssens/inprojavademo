package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDemo {
    static final String DB_URL = "jdbc:mysql://localhost/inprojava";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT id, naam, leeftijd FROM Persoon";

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);

        while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Naam: " + rs.getString("naam"));
            System.out.println(", Leeftijd: " + rs.getInt("leeftijd"));
        }

        conn.close();
    }
}
