package fitness;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseInitializer {
    public static void createTables() {
        String createUsersTable = "CREATE TABLE IF NOT EXISTS users ("
                + "id SERIAL PRIMARY KEY,"
                + "name VARCHAR(100) NOT NULL,"
                + "age INT,"
                + "weight DOUBLE PRECISION"
                + ");";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(createUsersTable);
            System.out.println("Кестелер тексерілді/құрылды.");
        } catch (SQLException e) {
            System.err.println("Кесте құру қатесі: " + e.getMessage());
        }
    }
}