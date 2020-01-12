package com.liukai.design.decorate;

/**
 * Title: Component 的一个具体实现类
 * Description:
 *
 * @author liu kai
 * @date 2018/7/6 10:39.
 */
public class ConcreteComponent extends Component {

    @Override
    void Operation() {
        System.out.println("Component - ConcreteComponent 执行方法");
    }
}
