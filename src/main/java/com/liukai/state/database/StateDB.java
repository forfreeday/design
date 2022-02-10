package com.liukai.state.database;

/**
 * @author liukai
 * @since 2022/2/10.
 */
public interface StateDB {

  void put(byte[] key, byte[] value);

  void delete(byte[] key);

  void reset();
}
