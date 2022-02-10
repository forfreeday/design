package com.liukai.design;


import com.liukai.state.manager.StateManager;
import com.liukai.state.manager.StateManagerImpl;
import com.liukai.state.node.StateNode;
import org.junit.jupiter.api.Test;

/**
 * @author liukai
 * @since 2022/2/10.
 */
public class StateManagerImplTest {

  @Test
  public void buildState() {
    StateManager stateManager = new StateManagerImpl();
    StateNode stateNode = stateManager.buildState();

  }

  @Test
  void advanceState() {
    StateManager stateManager = new StateManagerImpl();
    StateNode stateNode = stateManager.buildState();
    stateManager.advanceState();
  }

  @Test
  void mergeState() {
  }

  @Test
  void resetState() {
  }

  @Test
  void flushStateToDB() {
  }
}
