package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LegacyCollections {

  // 不変リスト化の古典的パターン（→ List.of(...)）
  public static List<String> colors() {
    return Collections.unmodifiableList(Arrays.asList("Red", "Green", "Blue")); // ← (9) JavaUtilAPIs
  }

  // Stream 収集の古い書き方（→ .toList()）
  public static List<String> ids(List<Integer> nums) {
    return nums.stream()
        .map(Object::toString)
        .collect(Collectors.toUnmodifiableList()); // ← (9) JavaUtilAPIs で .toList() に
  }
}