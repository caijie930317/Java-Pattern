package service;

import imp.PersonStatus;

/**
 * 环境类
 * @date 2019/2/21
 */
public class Person {
    private PersonStatus status = null;

    private String name;

    private Integer hour = 0;

    public Person(Integer hour,String name){
        this.hour = hour;
        this.name = name;
        this.status = new GetUp(this);
    }

    public void doSth(Integer nowHour){
        status.doSth(nowHour);
        System.out.println("现在时间是:"+this.hour);
        System.out.println(this.name+"现在状态是:"+this.status.computeStatus());
        System.out.println("---------------------------------------------");
    }

    public void setStatus(PersonStatus status) {
        this.status = status;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
}
