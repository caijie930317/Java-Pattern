package imp;

/**
 * 批准者父类
 * @date 2019/2/22
 */
public abstract class Approver {
    /**
     * 便于调用子类，定义继承对象
     */
    protected Approver approver;
    /**
     * 审批者
     */
    protected String approverName;

    public Approver(String approverName) {
        this.approverName = approverName;
    }


    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 请求转发
     * @param rquest
     */
    public abstract void processRequest(LeaveRquest rquest);
}
