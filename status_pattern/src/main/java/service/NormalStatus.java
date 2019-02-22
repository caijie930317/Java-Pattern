package service;

import imp.IStatus;



/**
 * 正常状态
 * @date 2019/2/21
 */
public class NormalStatus extends IStatus {


    public NormalStatus(AccountM accountM){
        this.accountM = accountM;
    }

    public NormalStatus(IStatus status){
        this.accountM = status.accountM;
    }

    /**
     * 存款
     * @param amount
     */
    public void deposit(double amount) {
        //将存款金额付给环境类
        accountM.setBalance(accountM.getBalance()+amount);
        //进行核查
        statusCheck();

    }

    /**
     * 取款
     * @param amount
     */
    public void withdraw(double amount) {
        accountM.setBalance(accountM.getBalance()-amount);
        statusCheck();
    }

    /**
     * 核查状态
     */
    public void statusCheck() {
        if (accountM.getBalance() > -2000 && accountM.getBalance() <= 0) {
            accountM.setStatus(new OverdraftState(this));
        }
        else if (accountM.getBalance() == -2000) {
            accountM.setStatus(new RestrictedState(this));
        }
        else if (accountM.getBalance() < -2000) {
            System.out.println("操作受限！");
        }

    }

    /**
     * 切换状态
     */
    public String computeStatus() {
        return "正常状态，无须支付利息！";
    }

}
