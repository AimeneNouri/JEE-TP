import proxy.Account;
import proxy.BankService;
import proxy.BankWS;

public class ClientWS {
    public static void main(String[] args) {
        BankService stub = new BankWS().getBankServicePort();
        System.out.println(stub.convertToMAD(10));
        Account account = stub.getAccount(10);
        System.out.println("Code: " + account.getCode());
        System.out.println("Balance: " + account.getBalance());
    }
}
