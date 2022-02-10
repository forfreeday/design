package com.liukai.state.database;

import com.liukai.state.node.Node;
import com.liukai.state.node.StateNode;

/**
 * 数据库抽象
 * 可对实际使用到的数据源进行切换
 * @author liukai
 * @since 2022/2/10.
 */
public class DataBase implements StateDB {



  public DataBase(Node node) {

  }

  @Override
  public void put(byte[] key, byte[] value) {

  }

  @Override
  public void delete(byte[] key) {

  }

  @Override
  public void reset() {

  }
}
