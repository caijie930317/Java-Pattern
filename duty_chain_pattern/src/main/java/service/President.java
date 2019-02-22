package service;

import imp.Approver;
import imp.LeaveRquest;

/**
 * @date 2019/2/22
 */
public class President extends Approver {

    public President(String approverName) {
        super(approverName);
    }

    public void processRequest(LeaveRquest rquest) {
        if(rquest.getLeaveDays() <= 30){
            System.out.println("总经理"+this.approverName+"审批假条:" +
                    rquest.getName()+rquest.getLeaveReason()+"请假"+rquest.getLeaveDays()+"天!");
        }else{
            this.approver.processRequest(rquest);
        }
    }
}
