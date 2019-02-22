package service;

import imp.PersonStatus;

/**
 * @date 2019/2/21
 */
public class Study extends PersonStatus {

    public Study(PersonStatus status){
        this.person = status.person;
    }

    public void doSth(Integer nowHour) {
        person.setHour(nowHour+person.getHour());
        statusCheck();
    }

    public void statusCheck() {
        if(person.getHour() == 7){
            person.setStatus(new GetUp(this));
        }else if(person.getHour() == 12){
            person.setStatus(new EatRice(this));
        }else if((person.getHour() >= 18 && person.getHour() <= 24)
                || (person.getHour() >= 0 && person.getHour() <= 7)){
            person.setStatus(new Sleep(this));
        }
    }

    public String computeStatus() {
        return "学习中!";
    }
}
