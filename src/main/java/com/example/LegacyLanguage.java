package com.example;

public class LegacyLanguage {

  // 連結だらけの複数行文字列（→ テキストブロック）
  public static String json() {
    String s = "{\n" +
        "  \"id\": 1,\n" +
        "  \"name\": \"Taro\"\n" +
        "}";
    return s; // ← (3) UseTextBlocks
  }

  // 代入ベースの switch（→ switch 式）
  public static int scoreOf(String grade) {
    int score;
    switch (grade) {                // ← (4) SwitchCaseAssignmentsToSwitchExpression
      case "A": score = 5; break;
      case "B": score = 4; break;
      default:  score = 0;
    }
    return score;
  }

  // return ベースの switch（→ switch 式）
  public static String labelOf(int type) {
    switch (type) {                 // ← (5) SwitchCaseReturnsToSwitchExpression
      case 1: return "ONE";
      case 2: return "TWO";
      default: return "OTHER";
    }
  }

  // A.class.isInstance(x)（→ x instanceof A）
  public static boolean isNumber(Object obj) {
    return Number.class.isInstance(obj); // ← (8) ReplaceClassIsInstanceWithInstanceof
  }
}