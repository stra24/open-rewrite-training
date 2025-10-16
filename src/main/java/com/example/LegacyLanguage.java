package com.example;

public class LegacyLanguage {

  // 連結だらけの複数行文字列（→ テキストブロック）
  public static String json() {
    return """
        {
          "id": 1,
          "name": "Taro"
        }\
        """; // ← (3) UseTextBlocks
  }

  // 代入ベースの switch（→ switch 式）
  public static int scoreOf(String grade) {
    return switch (grade) {                // ← (4) SwitchCaseAssignmentsToSwitchExpression
      case "A" -> 5;
      case "B" -> 4;
      default -> 0;
    };
  }

  // return ベースの switch（→ switch 式）
  public static String labelOf(int type) {
    return switch (type) {                 // ← (5) SwitchCaseReturnsToSwitchExpression
      case 1 -> "ONE";
      case 2 -> "TWO";
      default -> "OTHER";
    };
  }

  // A.class.isInstance(x)（→ x instanceof A）
  public static boolean isNumber(Object obj) {
    return obj instanceof Number; // ← (8) ReplaceClassIsInstanceWithInstanceof
  }
}