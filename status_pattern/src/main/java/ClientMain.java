import service.AccountM;

/**
 * @date 2019/2/21
 */
public class ClientMain {

    public static void main(String[] args){
        AccountM acc = new AccountM(0.0,"蔡杰");
        acc.desposit(1000);
        acc.withdraw(2000);
        acc.desposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.withdraw(2000);
        acc.desposit(5000);
        acc.withdraw(1000);
    }
}
