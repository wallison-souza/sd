
package ws.org;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.org package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddAccountResponse_QNAME = new QName("http://org.ws/", "AddAccountResponse");
    private final static QName _ListAccount_QNAME = new QName("http://org.ws/", "ListAccount");
    private final static QName _DeleteAccount_QNAME = new QName("http://org.ws/", "DeleteAccount");
    private final static QName _AddAccount_QNAME = new QName("http://org.ws/", "AddAccount");
    private final static QName _AccountBalanceResponse_QNAME = new QName("http://org.ws/", "AccountBalanceResponse");
    private final static QName _AccountBalance_QNAME = new QName("http://org.ws/", "AccountBalance");
    private final static QName _DeleteAccountResponse_QNAME = new QName("http://org.ws/", "DeleteAccountResponse");
    private final static QName _ListAccountResponse_QNAME = new QName("http://org.ws/", "ListAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.org
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountBalanceResponse }
     * 
     */
    public AccountBalanceResponse createAccountBalanceResponse() {
        return new AccountBalanceResponse();
    }

    /**
     * Create an instance of {@link AccountBalance }
     * 
     */
    public AccountBalance createAccountBalance() {
        return new AccountBalance();
    }

    /**
     * Create an instance of {@link DeleteAccountResponse }
     * 
     */
    public DeleteAccountResponse createDeleteAccountResponse() {
        return new DeleteAccountResponse();
    }

    /**
     * Create an instance of {@link ListAccountResponse }
     * 
     */
    public ListAccountResponse createListAccountResponse() {
        return new ListAccountResponse();
    }

    /**
     * Create an instance of {@link AddAccountResponse }
     * 
     */
    public AddAccountResponse createAddAccountResponse() {
        return new AddAccountResponse();
    }

    /**
     * Create an instance of {@link ListAccount }
     * 
     */
    public ListAccount createListAccount() {
        return new ListAccount();
    }

    /**
     * Create an instance of {@link DeleteAccount }
     * 
     */
    public DeleteAccount createDeleteAccount() {
        return new DeleteAccount();
    }

    /**
     * Create an instance of {@link AddAccount }
     * 
     */
    public AddAccount createAddAccount() {
        return new AddAccount();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "AddAccountResponse")
    public JAXBElement<AddAccountResponse> createAddAccountResponse(AddAccountResponse value) {
        return new JAXBElement<AddAccountResponse>(_AddAccountResponse_QNAME, AddAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "ListAccount")
    public JAXBElement<ListAccount> createListAccount(ListAccount value) {
        return new JAXBElement<ListAccount>(_ListAccount_QNAME, ListAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "DeleteAccount")
    public JAXBElement<DeleteAccount> createDeleteAccount(DeleteAccount value) {
        return new JAXBElement<DeleteAccount>(_DeleteAccount_QNAME, DeleteAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "AddAccount")
    public JAXBElement<AddAccount> createAddAccount(AddAccount value) {
        return new JAXBElement<AddAccount>(_AddAccount_QNAME, AddAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "AccountBalanceResponse")
    public JAXBElement<AccountBalanceResponse> createAccountBalanceResponse(AccountBalanceResponse value) {
        return new JAXBElement<AccountBalanceResponse>(_AccountBalanceResponse_QNAME, AccountBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "AccountBalance")
    public JAXBElement<AccountBalance> createAccountBalance(AccountBalance value) {
        return new JAXBElement<AccountBalance>(_AccountBalance_QNAME, AccountBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "DeleteAccountResponse")
    public JAXBElement<DeleteAccountResponse> createDeleteAccountResponse(DeleteAccountResponse value) {
        return new JAXBElement<DeleteAccountResponse>(_DeleteAccountResponse_QNAME, DeleteAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "ListAccountResponse")
    public JAXBElement<ListAccountResponse> createListAccountResponse(ListAccountResponse value) {
        return new JAXBElement<ListAccountResponse>(_ListAccountResponse_QNAME, ListAccountResponse.class, null, value);
    }

}
