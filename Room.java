package cn.edu.whut.sept.zuul;

import java.util.Set;




import java.util.HashMap;

public class Room {

  // 房间的信息
  private String description;
  // 房间出口方向对应的房间
  private HashMap<String, Room> exits;

  /**
   * 初始化房间的信息和出口.
   *
   * @param description 房间名称等简要信息.
   */
  public Room(String description) {
    this.description = description;
    exits = new HashMap<>();
  }

  /**
   * 给房间添加出口，指向另外一个房间.
   *
   * @param direction 出口方向.
   * @param neighbor  出口房间.
   */
  public void setExit(String direction, Room neighbor) {
    exits.put(direction, neighbor);
  }

  /**
   * 获得房间的简要信息.
   *
   * @return 返回该房间的信息.
   */
  public String getShortDescription() {
    return description;
  }

  /**
   * 获得该房间的具体信息，包括出口.
   *
   * @return 返回该房间的简要信息和出口位置.
   */
  public String getLongDescription() {
    return "You are " + description + ".\n" + getExitString();
  }

  /**
   * 获得该房间的所有出口方向.
   *
   * @return 返回该房间出口方向.
   */
  private String getExitString() {
    StringBuilder returnString = new StringBuilder("Exits:");
    Set<String> keys = exits.keySet();
    for (String exit : keys) {
      returnString.append(" ").append(exit);
    }
    return returnString.toString();
  }

  /**
   * 获得该房间指定方向的出口房间.
   *
   * @param direction 方向.
   * @return 返回该出口方向对应的房间.
   */
  public Room getExit(String direction) {
    return exits.get(direction);
  }
}


