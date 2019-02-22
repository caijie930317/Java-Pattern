package service;

import imp.Approver;
import imp.LeaveRquest;

/**
 * @date 2019/2/22
 */
public class Congress extends Approver {

    public Congress(String approverName) {
        super(approverName);
    }

    public void processRequest(LeaveRquest rquest) {
        System.out.println("董事会审批假条:"+rquest.getName()+rquest.getLeaveReason()+"请假"+rquest.getLeaveDays()+"天!");
    }
}
