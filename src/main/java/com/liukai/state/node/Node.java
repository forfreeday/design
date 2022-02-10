package com.liukai.state.node;

/**
 * @author liukai
 * @since 2022/2/10.
 */
public interface Node {

  Node getHead();


  Node getNext();

  void setNext(Node node);

  Node getRoot();

  String getName();

  int nodeNumber();

  Node advance(Node node);
}
