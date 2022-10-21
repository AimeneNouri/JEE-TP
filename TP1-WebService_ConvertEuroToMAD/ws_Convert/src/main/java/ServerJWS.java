import jakarta.xml.ws.Endpoint;
import ws_package.BankService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:1961/", new BankService());
        System.out.println("Web Service is deployed on http://0.0.0.0:1961/");
    }
}
