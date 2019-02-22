import imp.Approver;
import imp.LeaveRquest;
import service.Congress;
import service.Derector;
import service.Managet;
import service.President;

/**
 * @date 2019/2/22
 */
public class ClientMain {

    public static void main(String[] args){
        Approver zhangwj,yangg,huangys,meeting;
        zhangwj = new Derector("张无忌");
        yangg = new Managet("杨过");
        huangys = new President("黄药师");
        meeting = new Congress("董事会");

        //创建职责链，审批过程按照这个来执行
        //注意职责链跟上面定义的具体处理者的位置别弄错了
        zhangwj.setApprover(yangg);
        yangg.setApprover(huangys);
        huangys.setApprover(meeting);

        //具体请求事件
        LeaveRquest lr = new LeaveRquest(1,"小明","肚子疼");
        zhangwj.processRequest(lr);

        LeaveRquest lr2 = new LeaveRquest(5,"杰克","体育课脚扭了");
        zhangwj.processRequest(lr2);

        LeaveRquest lr3 = new LeaveRquest(12,"张三","打架住医院了");
        zhangwj.processRequest(lr3);

        LeaveRquest lr4 = new LeaveRquest(32,"李四","房子被洪水冲垮了，回家建房");
        zhangwj.processRequest(lr4);
    }
}
