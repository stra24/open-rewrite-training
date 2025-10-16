package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;            // ← (7) UseDiamondOperator の対象

public class LegacyResources {

  // try-with-resources 内にあえて close() を残しておく（→ 不要 close の自動削除）
  public static String firstLine(Path path) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
      String line = br.readLine(); // ← (2) UnnecessaryCloseInTryWithResources で削除される
      return line;
    }
  }

  // 文字コード指定を文字列で（→ StandardCharsets に統一）
  public static byte[] toBytes(String s) {
    return s.getBytes(StandardCharsets.UTF_8); // ← (6) UseStandardCharset
  }

  // 冗長なジェネリクス（→ ダイヤモンド演算子）
  public static Map<String, Integer> ranks() {
    Map<String, Integer> map = new HashMap<>(); // ← (7) UseDiamondOperator
    map.put("Gold", 1);
    map.put("Silver", 2);
    map.put("Bronze", 3);
    return map;
  }
}