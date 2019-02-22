package service;

import imp.Approver;
import imp.LeaveRquest;

/**
 * @date 2019/2/22
 */
public class Derector extends Approver {

    /**
     * 通过构造方法传值
     * @param approverName
     */
    public Derector(String approverName) {
        super(approverName);
    }

    /**
     * 主任处理事件
     * @param rquest
     */
    public void processRequest(LeaveRquest rquest) {
        if(rquest.getLeaveDays() <= 3){
            System.out.println("主任"+this.approverName+"审批假条:"+
                    rquest.getName()+rquest.getLeaveReason()+"请假"+rquest.getLeaveDays()+"天!");
        }else{
            this.approver.processRequest(rquest);
        }
    }
}
