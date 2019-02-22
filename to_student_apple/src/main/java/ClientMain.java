import service.Person;

/**
 * @date 2019/2/21
 */
public class ClientMain {

    public static void main(String[] args){
        Person per = new Person(7,"小明");
        per.doSth(2);
        System.out.println("现在时间:"+per.getHour());
        per.doSth(3);
        per.doSth(4);
        per.doSth(6);
    }
}
