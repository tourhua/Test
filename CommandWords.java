package cn.edu.whut.sept.zuul;

public class CommandWords {

  /**
   * 定义合法指令字符串
   */
  private static final String[] validCommands = {
      "go", "quit", "help", "back"
  };

  /**
   * 暂时还没添加函数内容
   */
  public CommandWords() {
    // nothing to do at the moment...
  }

  /**
   * 判断当前指令是否合法.
   * @param aString 当前指令
   * @return 合法，则返回true，否则返回false.
   */
  public boolean isCommand(String aString) {
    for (String validCommand : validCommands) {
      if (validCommand.equals(aString)) {
        return true;
      }
    }
    return false;
  }

  /**
   * 显示已经定义的合法指令.
   */
  public void showAll() {
    for (String command : validCommands) {
      System.out.print(command + "  ");
    }
    System.out.println();
  }
}
