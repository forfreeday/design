package com.liukai.design.decorate;

/**
 * Title: 装饰接口
 * Description:
 *
 * @author liu kai
 * @date 2018/6/11 13:26.
 */
public abstract class Decorate extends Component{


    private Component component;


    public void setComponent (Component component) {
        this.component = component;
    }

    /**
     * Method:  装饰接口方法
     * Description:
     * Author: liu kai
     * Date: 2018/6/21 11:31
     *
     * @param
     * @return void
     */
    public void Operation() {
        System.out.println("Decorate 中执行原方法");
        if (null != component) {
            component.Operation();
        }
    }
}
