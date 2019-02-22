package imp;

import service.Person;

/**
 * 状态抽象类
 * @date 2019/2/21
 */
public abstract class PersonStatus {
    public Person person = null;
    /**
     * 到时间需要做的事情
     */
    public abstract void doSth(Integer hour);
    /**
     * 调整状态
     */
    public abstract String computeStatus();
}
