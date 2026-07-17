/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uj {
    static int field_d;
    static String field_a;
    static String field_e;
    static String field_b;
    static cn field_c;

    final static int a(Random param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if (param2 <= 0) {
              throw new IllegalArgumentException();
            } else {
              if (qh.a(param2, 245)) {
                stackOut_6_0 = (int)(((long)param0.nextInt() & 4294967295L) * (long)param2 >> 32);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                L1: {
                  var3_int = -2147483648 + -(int)(4294967296L % (long)param2);
                  if (param1 == 37) {
                    break L1;
                  } else {
                    field_c = null;
                    break L1;
                  }
                }
                L2: while (true) {
                  var4 = param0.nextInt();
                  if (var3_int <= var4) {
                    continue L2;
                  } else {
                    stackOut_11_0 = cc.a(param2, var4, (byte) -122);
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("uj.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_12_0;
    }

    final static String a(long param0) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = DungeonAssault.field_K;
        if (param0 > 0L) {
          if (6582952005840035281L > param0) {
            if (param0 % 37L == 0L) {
              return null;
            } else {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (0L == param0) {
                      StringBuilder discarded$2 = var6.reverse();
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7 = param0;
                        param0 = param0 / 37L;
                        var9 = ak.field_j[(int)(-(param0 * 37L) + var7)];
                        if (var9 != 95) {
                          break L2;
                        } else {
                          var10 = -1 + var6.length();
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          var9 = 160;
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append(var9);
                      continue L1;
                    }
                  }
                } else {
                  var4 = var4 / 37L;
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a() {
        field_c = null;
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final static void a(en param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          rb.field_O = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("uj.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 95 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Renown";
        field_a = "Please check if address is correct";
        field_b = "When entering a monster room, you can choose for your raider to Charge (increases Attack, decreases Defence), Advance (which leaves stats unchanged) or Flee (attempt to retreat from the room without engaging in combat). When combat begins, the raider's Sneak level is rolled against the monster's Detect level to determine who attacks first. In each round of combat, the attacker's Attack level is rolled against the defender's Defence level - if the attacker wins, the defender is defeated, otherwise, if the defender wins, they get a turn to attack. Fleeing works in much the same way, but instead of attacking each round, the raider rolls Dodge against the room's Snare - if successful, the raider escapes.";
    }
}
