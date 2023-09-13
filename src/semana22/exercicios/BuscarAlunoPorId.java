package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarAlunoPorId {
    public static void main(String[] args) throws SQLException  {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o id");
        int id1 = sc.nextInt();


        String sql = "SELECT * FROM alunos WHERE id = ?;";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id1);
        ResultSet rs = pstm.executeQuery(sql);

        while(rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            Boolean ativo = rs.getBoolean("ativo");

            System.out.println(id);
            System.out.println(nome);
            System.out.println(email);
            System.out.println(ativo);

        }
        conn.close();
        pstm.close();
        sc.close();
    }
    
}