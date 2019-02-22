package imp;


import service.AccountM;

/**
 * 状态抽象类
 */
public abstract class IStatus {
    public AccountM accountM = null;
    //存款
    public abstract void deposit(double amount);
    //取款
    public abstract void withdraw(double amount);
    //核查状态
    public abstract void statusCheck();
    //调整状态
    public abstract String computeStatus();
}
