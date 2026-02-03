package fitness;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Дерекқор баптаулары (Өзіңдікін тексер)
    private static final String URL = "jdbc:postgresql://localhost:5432/PersonalFitnessTracker";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1212";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}