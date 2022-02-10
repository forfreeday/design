package com.liukai.state.node;

/**
 * 状态根节点
 * @author liukai
 * @since 2022/2/10.
 */
public class RootNode<T> implements Node {

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
    return null;
  }
}
