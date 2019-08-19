/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import ws.org.*;
/**
 *
 * @author Geral
 */
public class ClienteWS {
    
    public static void main(String[] a){
       Servidor_Service servico = new Servidor_Service();
       Servidor porta = servico.getServidorPort();
       List<Cliente> response = porta.listAccount("");
       for (Cliente cliente : response){
           System.out.println("Nome: "+cliente.getNome());
       }
    }
    
    
}
