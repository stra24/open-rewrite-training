package com.example;

import java.util.Objects; // ← 未使用（削除対象）

public  class   FormattingSample {   // ← スペースばらつき（整形対象）

  public static String greet(String name) {
    if(name == null || name.isBlank()) {
      return  "Hello, world!";
    } else {
      // Objects.toStringでnull安全に文字列化（Objectsは使う）
      return "Hello, " + Objects.toString(name);
    }
  }

}