package com.liukai.state.manager;

import com.liukai.state.node.StateNode;

/**
 * 状态管理器
 * @author liukai
 * @since 2022/2/10.
 */
public interface StateManager {

  //初始化
  void init();

  //创建状态
  StateNode buildState();

  //创建新状态节点
  void advanceState();

  //状态合并
  void mergeState();

  //状态回退
  void resetState();

  //状态刷盘
  void flushStateToDB();
}
