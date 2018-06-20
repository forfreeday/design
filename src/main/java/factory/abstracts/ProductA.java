package factory.abstracts;

/**
 * Created by kayle on 16/8/29.
 * 不直接实现接口，而实现抽象类是因为，实现抽象类可以在抽象类中添加新方法。
 */
public class ProductA extends AbstractProductA {

    public void run() {
        System.out.println("产品a.....");
    }
}
