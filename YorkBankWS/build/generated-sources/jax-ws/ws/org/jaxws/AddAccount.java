
package ws.org.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AddAccount", namespace = "http://org.ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAccount", namespace = "http://org.ws/", propOrder = {
    "id",
    "pin",
    "nome",
    "cpf",
    "saldoInicial"
})
public class AddAccount {

    @XmlElement(name = "id", namespace = "")
    private String id;
    @XmlElement(name = "pin", namespace = "")
    private String pin;
    @XmlElement(name = "nome", namespace = "")
    private String nome;
    @XmlElement(name = "cpf", namespace = "")
    private String cpf;
    @XmlElement(name = "saldo_inicial", namespace = "")
    private Double saldoInicial;

    /**
     * 
     * @return
     *     returns String
     */
    public String getId() {
        return this.id;
    }

    /**
     * 
     * @param id
     *     the value for the id property
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getPin() {
        return this.pin;
    }

    /**
     * 
     * @param pin
     *     the value for the pin property
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * 
     * @param nome
     *     the value for the nome property
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCpf() {
        return this.cpf;
    }

    /**
     * 
     * @param cpf
     *     the value for the cpf property
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * 
     * @return
     *     returns Double
     */
    public Double getSaldoInicial() {
        return this.saldoInicial;
    }

    /**
     * 
     * @param saldoInicial
     *     the value for the saldoInicial property
     */
    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

}
