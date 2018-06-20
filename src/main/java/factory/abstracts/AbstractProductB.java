package factory.abstracts;

/**
 * Created by kayle on 16/8/29.
 */
public abstract class AbstractProductB implements AbstractProductRoot{
    // 每个产品的共有方法
    public void create() {

    }

    // 每个产品的相同方法，不同实现
    public abstract void run();
}
