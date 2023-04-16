/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

/**
 *
 * @author Administrador
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connsql {

    public static String status = "Não conectado";

    public Connsql() {
    }

    public Connection getConexaoMysQL() {
        Connection conexao = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String dirverName = "com.mysql.jdbc.Driver";
            Class.forName(dirverName);

            String servidor = "localhost";
            String schema = "teste";
            String url = "jdbc:mysql://" + servidor + "/" + schema;
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(url, usuario, senha);

            if (conexao != null) {
                status = ("Conectado do sucesso");
            } else {
                status = ("Erro na Conexão");
            }
            return conexao;
        } catch (ClassNotFoundException cnf) {
            System.out.println("drive especificado não foi");
            return null;
        } catch (SQLException s) {
            return null;
        }
    }

    public static String statusConnection() {
        return status;
    }

    public boolean FecharConexaoMysQL() {
        try {
            getConexaoMysQL().close();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }

    public Connection ReiniciarConexaoMysQL() {
        FecharConexaoMysQL();
        return getConexaoMysQL();
    }
}
