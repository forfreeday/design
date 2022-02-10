package com.liukai.state.node;

/**
 * 状态链表节点
 * 存储当前业务的状态信息在内存当中
 * 每一个状态都会创建一个新的存储节点
 *
 * @author liukai
 * @since 2022/2/10.
 */
public class StateNode<T> implements Node {

  private Node stateNode;

  private Node rootNode;

  @Override
  public Node getHead() {
    return null;
  }

  @Override
  public Node getNext() {
    return null;
  }

  @Override
  public void setNext(Node node) {

  }

  @Override
  public Node getRoot() {
    return null;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public int nodeNumber() {
    return 0;
  }

  @Override
  public Node advance(Node node) {
    StateNode<Object> objectStateNode = new StateNode<>();
    node.setNext(objectStateNode);
    return node;
  }
}
