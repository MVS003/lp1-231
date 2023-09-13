package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarAluno { 
    public static void main(String[] args) throws SQLException {
        
    String url = "jdbc:mysql://localhost/alunosdb?user=root&password=mateus&useSSL=true";
    Connection conn = DriverManager.getConnection(url);

    Scanner scan = new Scanner(System.in);
    int id = scan.nextInt();

    String sql = "DELETE FROM alunos WHERE id = ?;";
    PreparedStatement pstm = conn.prepareStatement(sql);
    pstm.setInt(1, id);
    pstm.executeUpdate();

    scan.close();
    pstm.close();
    conn.close();
    }
}