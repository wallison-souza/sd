package cl.views.tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import ws.org.*;

/**
 *
 * @author joaov
 */
public class ClienteTableModel extends AbstractTableModel{

    private List <Cliente> lista;
    private static final String[] nomes = new String[] {"Id", "NOME", "CPF", "SALDO"};
    
    public ClienteTableModel(List <Cliente> list){
        this.lista = list;
    }
    
    public String getColumnName(int column) {
        return nomes[column];
    }
    
    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return 4;
    }


    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = lista.get(rowIndex);
        System.out.println(cliente.getId());
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getSaldoIncial());
        switch(columnIndex){
            case 0:
                return cliente.getId();
            case 1:
                return cliente.getNome();
            case 2:
                return cliente.getCpf();
            case 3:
                return cliente.getSaldoIncial();
        }
        return null;
    }
    
}
