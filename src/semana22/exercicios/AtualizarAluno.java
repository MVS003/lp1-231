package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarAluno {
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://localhost/alunosdb?user=root&password=mateus&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        String nome = scan.nextLine();
        String email = scan.nextLine();
        boolean ativo = scan.nextBoolean();

        String sql = "UPDATE alunos SET id = ?, nome = ?, email = ?, ativo = ? WHERE id = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setString(2, nome);
        pstm.setString(3, email);
        pstm.setBoolean(4, ativo);
        pstm.setInt(5, id);

        pstm.executeUpdate();

        scan.close();
        pstm.close();
        conn.close();
    }    
    
}