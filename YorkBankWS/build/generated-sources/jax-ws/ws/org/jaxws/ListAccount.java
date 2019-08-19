
package ws.org.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ListAccount", namespace = "http://org.ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListAccount", namespace = "http://org.ws/")
public class ListAccount {

    @XmlElement(name = "nome", namespace = "")
    private String nome;

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

}
