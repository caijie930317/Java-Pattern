package imp;

/**
 * 请假请求类
 * @date 2019/2/22
 */
public class LeaveRquest {
    /**
     * 请假天数
     */
    private int leaveDays;
    /**
     * 请假人
     */
    private String name;
    /**
     * 请假原因
     */
    private String leaveReason;

    public LeaveRquest(int leaveDays, String name, String leaveReason) {
        this.leaveDays = leaveDays;
        this.name = name;
        this.leaveReason = leaveReason;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }
}
