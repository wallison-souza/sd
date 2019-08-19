
package ws.org.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ws.model.Cliente;

@XmlRootElement(name = "ListAccountResponse", namespace = "http://org.ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListAccountResponse", namespace = "http://org.ws/")
public class ListAccountResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Cliente> _return;

    /**
     * 
     * @return
     *     returns List<Cliente>
     */
    public List<Cliente> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Cliente> _return) {
        this._return = _return;
    }

}
