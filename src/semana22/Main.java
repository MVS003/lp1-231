package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {
        //1.Criar a conexão
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        //2.Executar a consulta SQL
        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome TEXT, email TEXT, ativo BOOL);";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        //3.Fechar a conexão
        stm.close();
        conn.close();

    }
}
