
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/taskmanager_db";
        String user = "postgres";
        String password = System.getenv("DB_PASSWORD");

        if (password == null || password.isEmpty()) {
            throw new SQLException("DB_PASSWORD is not configured");
        }

        return DriverManager.getConnection(url, user, password);
    }
}
