package com.example;

import java.util.List;

public class LegacyCollections {

  // 不変リスト化の古典的パターン（→ List.of(...)）
  public static List<String> colors() {
    return List.of("Red", "Green", "Blue"); // ← (9) JavaUtilAPIs
  }

  // Stream 収集の古い書き方（→ .toList()）
  public static List<String> ids(List<Integer> nums) {
    return nums.stream()
        .map(Object::toString)
        .toList(); // ← (9) JavaUtilAPIs で .toList() に
  }
}