package service;

import imp.IStatus;

/**
 * 冻结状态
 * @date 2019/2/21
 */
public class RestrictedState extends IStatus {


    public RestrictedState(IStatus status) {
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
        if (accountM.getBalance() > 0) {
            accountM.setStatus(new NormalStatus(this));
        }
        else if (accountM.getBalance() > -2000) {
            accountM.setStatus(new OverdraftState(this));
        }

    }

    /**
     * 切换状态
     */
    public String computeStatus() {
        return "冻结状态，计算利息!";
    }
}
