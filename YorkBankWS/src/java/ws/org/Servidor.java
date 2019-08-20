/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.org;
import ws.model.Cliente;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Geral
 */
@WebService(serviceName = "Servidor")
public class Servidor {
public String db = "jdbc:postgresql://localhost:5432/bank"; 

public String adpter = "postgres";
public String password = "12345678";
    @WebMethod(operationName = "AddAccount")
    public String AddAccount(@WebParam(name = "id") String id, @WebParam(name = "pin") String pin, @WebParam(name = "nome") String nome,@WebParam(name = "cpf") String cpf, @WebParam(name = "saldo_inicial") Double saldo_inicial) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(db, adpter, password);
            String sql = "insert into account" + "(nome,cpf,pin,saldo_inicial)"
                    + "values" + "('" + nome + "'," + "'" + cpf + "',"
                    + "'" + pin + "'," +saldo_inicial+ ");";
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            con.close();
            return "Conta adicionada com sucesso";
        } catch (Exception erro) {
            erro.printStackTrace();
            return "Falha na cri;'ao da conta";
        }
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "DeleteAccount")
    public String DeleteAccount(@WebParam(name = "id") String id, @WebParam(name = "pin") String pin) {
        
        try  {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(db, adpter, password);
            String sql = "delete from account" + " where id = " + id + " and pin = '"+pin+"'";
            System.out.println(sql);
            Statement st = con.createStatement();
//            st.execute(sql);
            int retorno = st.executeUpdate(sql);
            if(retorno > 0){
                 return "Conta deletada com sucesso";
            }else{
                 return "Conta nao encontrada ou pin errado";
            } 
           
        } catch (Exception erro) {
            erro.printStackTrace();
            return "Falha ao deletar conta";
        }
    }

    /**
     * Operação de Web service
     * @return 
     */
    @WebMethod(operationName = "ListAccount")
    public List<Cliente> ListAccount(@WebParam(name = "nome") String nome) {
       List<Cliente> lista = new ArrayList<Cliente>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(db, adpter, password);
            String sql = "select * from account where nome ilike '"+nome+"%';";
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSaldo_incial(rs.getDouble("saldo_inicial"));
                lista.add(cliente);
            }
        } catch (Exception erro) {
            erro.printStackTrace();
             
        }
        return lista;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "AccountBalance")
    public Cliente AccountBalance (@WebParam(name = "id") String id, @WebParam(name = "pin") String pin) {
        Cliente cliente = new Cliente();
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(db, adpter, password);
            String sql = "select * from account where id = "+id+" and pin = '"+pin+"';";
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                cliente.setId(rs.getInt("int"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setSaldo_incial(rs.getDouble("saldo_inicial"));
            }
        } catch (Exception erro) {
            erro.printStackTrace();
             
        }
        return cliente;
    }
    }

 

