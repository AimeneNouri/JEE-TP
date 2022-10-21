
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _ConvertToMAD_QNAME = new QName("http://ws_package/", "ConvertToMAD");
    private final static QName _ConvertToMADResponse_QNAME = new QName("http://ws_package/", "ConvertToMADResponse");
    private final static QName _Account_QNAME = new QName("http://ws_package/", "account");
    private final static QName _GetAccount_QNAME = new QName("http://ws_package/", "getAccount");
    private final static QName _GetAccountResponse_QNAME = new QName("http://ws_package/", "getAccountResponse");
    private final static QName _GetAccounts_QNAME = new QName("http://ws_package/", "getAccounts");
    private final static QName _GetAccountsResponse_QNAME = new QName("http://ws_package/", "getAccountsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertToMAD }
     * 
     * @return
     *     the new instance of {@link ConvertToMAD }
     */
    public ConvertToMAD createConvertToMAD() {
        return new ConvertToMAD();
    }

    /**
     * Create an instance of {@link ConvertToMADResponse }
     * 
     * @return
     *     the new instance of {@link ConvertToMADResponse }
     */
    public ConvertToMADResponse createConvertToMADResponse() {
        return new ConvertToMADResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link GetAccounts }
     * 
     * @return
     *     the new instance of {@link GetAccounts }
     */
    public GetAccounts createGetAccounts() {
        return new GetAccounts();
    }

    /**
     * Create an instance of {@link GetAccountsResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountsResponse }
     */
    public GetAccountsResponse createGetAccountsResponse() {
        return new GetAccountsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertToMAD }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertToMAD }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_package/", name = "ConvertToMAD")
    public JAXBElement<ConvertToMAD> createConvertToMAD(ConvertToMAD value) {
        return new JAXBElement<>(_ConvertToMAD_QNAME, ConvertToMAD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertToMADResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertToMADResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_package/", name = "ConvertToMADResponse")
    public JAXBElement<ConvertToMADResponse> createConvertToMADResponse(ConvertToMADResponse value) {
        return new JAXBElement<>(_ConvertToMADResponse_QNAME, ConvertToMADResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_package/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_package/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_package/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_package/", name = "getAccounts")
    public JAXBElement<GetAccounts> createGetAccounts(GetAccounts value) {
        return new JAXBElement<>(_GetAccounts_QNAME, GetAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_package/", name = "getAccountsResponse")
    public JAXBElement<GetAccountsResponse> createGetAccountsResponse(GetAccountsResponse value) {
        return new JAXBElement<>(_GetAccountsResponse_QNAME, GetAccountsResponse.class, null, value);
    }

}
