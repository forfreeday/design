package com.liukai.state.manager;

import com.liukai.state.database.DataBase;
import com.liukai.state.node.Node;
import com.liukai.state.node.StateNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liukai
 * @since 2022/2/10.
 */
public class StateManagerImpl implements StateManager {

  private List<Node> nodes = new ArrayList<>();

  /**
   * 被始化，装载所有根节点
   */
  @Override
  public void init() {

  }

  @Override
  public StateNode buildState() {
    return null;
  }

  @Override
  public void advanceState() {
    nodes.forEach(node -> {

      node.getHead().advance(node);

    });
  }

  @Override
  public void mergeState() {

  }

  @Override
  public void resetState() {

  }

  @Override
  public void flushStateToDB() {

  }
}
