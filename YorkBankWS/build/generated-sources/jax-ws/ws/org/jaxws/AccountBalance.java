
package ws.org.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AccountBalance", namespace = "http://org.ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBalance", namespace = "http://org.ws/", propOrder = {
    "id",
    "pin"
})
public class AccountBalance {

    @XmlElement(name = "id", namespace = "")
    private String id;
    @XmlElement(name = "pin", namespace = "")
    private String pin;

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

}
