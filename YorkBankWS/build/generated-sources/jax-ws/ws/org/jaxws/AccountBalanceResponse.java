
package ws.org.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ws.model.Cliente;

@XmlRootElement(name = "AccountBalanceResponse", namespace = "http://org.ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBalanceResponse", namespace = "http://org.ws/")
public class AccountBalanceResponse {

    @XmlElement(name = "return", namespace = "")
    private Cliente _return;

    /**
     * 
     * @return
     *     returns Cliente
     */
    public Cliente getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Cliente _return) {
        this._return = _return;
    }

}
