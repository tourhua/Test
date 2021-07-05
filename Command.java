package cn.edu.whut.sept.zuul;

public class Command {

  /**
   * 指令字符串的两个部分
   */
  private String commandWord;
  private String secondWord;

  /**
   * 一个完整指令的构造函数
   *
   * @param firstWord  指令的第一个字符串
   * @param secondWord 指令的第二个字符串
   */
  public Command(String firstWord, String secondWord) {
    commandWord = firstWord;
    this.secondWord = secondWord;
  }

  /**
   * 获取第一个指令.
   *
   * @return 返回第一个指令字符串.
   */
  public String getCommandWord() {
    return commandWord;
  }

  /**
   * 获取第二个指令.
   *
   * @return 返回第二个指令字符串.
   */
  public String getSecondWord() {
    return secondWord;
  }

  /**
   * 判断当前指令是否存在.
   *
   * @return 如果指令为空，则返回true，否则返回false.
   */
  public boolean isUnknown() {
    return (commandWord == null);
  }

  /**
   * 判断当前指令是否存在
   *
   * @return 如果该指令不为空，则返回true，否则返回false.
   */
  public boolean hasSecondWord() {
    return (secondWord != null);
  }
}
