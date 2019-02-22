package service;


import imp.IStatus;

/**
 * 环境类
 * @date 2019/2/21
 */
public class AccountM {
    /**
     * 状态交互接口
     */
    private IStatus status = null;
    /**
     * 余额
     */
    private double balance = 0;
    /**
     * 开户名
     */
    private String owner = null;

    public AccountM(double init, String owner) {
        this.balance = balance;
        this.owner = owner;
        this.status = new NormalStatus(this);//初始化
        System.out.println(this.owner + "开户，初始金额为" + init);
        System.out.println("初始化方法成功...");
    }

    public void setStatus(IStatus status) {
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void desposit(double amount){
        System.out.println(this.owner + "存款" + amount);
        status.deposit(amount); //调用状态对象的deposit()方法
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为:"+ this.status.computeStatus());
        System.out.println("---------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        if(this.balance > -2000){
            status.withdraw(amount);
        } //调用状态对象的withdraw()方法
        else{
            System.out.println("操作受限，不能取款!");
        }
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为:"+ this.status.computeStatus());
        System.out.println("---------------------------------------------");
    }

    /*public String computeStatus()
    {
        return status.computeStatus(); //调用状态对象的computeInterest()方法
    }*/


}
