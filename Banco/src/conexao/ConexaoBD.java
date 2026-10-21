package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD {
    
    private static final String URL = "jdbc:mysql://localhost:3306/banco";
    private static final String USER = "root";
    private static final String PASSWORD = "16102005";
    
    public static Connection conexao() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
