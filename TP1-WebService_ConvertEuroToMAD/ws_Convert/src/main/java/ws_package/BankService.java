package ws_package;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWS")
public class BankService {
    static double EuroToMad = 10.82;

    @WebMethod(operationName = "ConvertToMAD")
    public double conversion(@WebParam(name = "amount") double mt) {
        return mt * EuroToMad;
    }

    @WebMethod()
    public Account getAccount(@WebParam(name = "code") int code) {
        return new Account(code, Math.random()*2000, new Date());
    }

    @WebMethod()
    public List<Account> getAccounts() {
        return List.of(
                new Account(1, Math.random()*2000, new Date()),
                new Account(2, Math.random()*2000, new Date()),
                new Account(3, Math.random()*2000, new Date()),
                new Account(4, Math.random()*2000, new Date())
        );
    }
}
