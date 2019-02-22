package service;

import imp.Approver;
import imp.LeaveRquest;

/**
 * @date 2019/2/22
 */
public class Managet extends Approver {

    public Managet(String approverName) {
        super(approverName);
    }

    /**
     * 主任处理假条
     * @param rquest
     */
    public void processRequest(LeaveRquest rquest) {
        if(rquest.getLeaveDays() <= 10){
            System.out.println("经理"+this.approverName+"审批假条:" +
                                       rquest.getName()+rquest.getLeaveReason()+"请假"+rquest.getLeaveDays()+"天!");
        }else{
            this.approver.processRequest(rquest);
        }
    }
}
