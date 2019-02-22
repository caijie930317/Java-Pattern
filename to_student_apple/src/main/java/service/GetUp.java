package service;

import imp.PersonStatus;

/**
 * @date 2019/2/21
 */
public class GetUp extends PersonStatus {

    public GetUp(Person person){
        this.person = person;
    }

    public GetUp(PersonStatus status){
        this.person = status.person;
    }

    public void doSth(Integer nowHour) {
        person.setHour(person.getHour() + nowHour);
        statusCheck();
    }

    public void statusCheck() {
        if(person.getHour() == 12){
            person.setStatus(new EatRice(this));
        }else if((person.getHour() > 7 && person.getHour() <12)
                || (person.getHour() >12 && person.getHour() < 18)){
            person.setStatus(new Study(this));
        }else if((person.getHour() >= 18 && person.getHour() <= 24)
                || (person.getHour() >= 0 && person.getHour() <= 7)){
            person.setStatus(new Sleep(this));
        }
    }

    public String computeStatus() {
        return "起床了!";
    }
}
