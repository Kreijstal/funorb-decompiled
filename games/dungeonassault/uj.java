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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if ((param2 ^ -1) >= -1) {
              throw new IllegalArgumentException();
            } else {
              if (qh.a(param2, 245)) {
                stackIn_7_0 = (int)(((long)param0.nextInt() & 4294967295L) * (long)param2 >> 247984800);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  var3_int = -2147483648 + -(int)(4294967296L % (long)param2);
                  if (param1 == 37) {
                    break L1;
                  } else {
                    field_c = (cn) null;
                    break L1;
                  }
                }
                L2: while (true) {
                  var4 = param0.nextInt();
                  if (var3_int <= var4) {
                    continue L2;
                  } else {
                    stackIn_12_0 = cc.a(param2, var4, (byte) -122);
                    decompiledRegionSelector0 = 1;
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
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("uj.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static String a(long param0, int param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var3;
        long var4;
        long var7;
        int var9;
        int var10;
        int var11;
        StringBuilder var12;
        StringBuilder var13;
        var11 = DungeonAssault.field_K;
        if (-1L > (param0 ^ -1L)) {
          if (6582952005840035281L > param0) {
            if (-1L != (param0 % 37L ^ -1L)) {
              if (param1 != -1) {
                field_d = -60;
                var3 = 0;
                var4 = param0;
                L0: while (true) {
                  if ((var4 ^ -1L) == -1L) {
                    var12 = new StringBuilder(var3);
                    L1: while (true) {
                      if (0L == param0) {
                        var12.reverse();
                        var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
                        return var12.toString();
                      } else {
                        L2: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = ak.field_j[(int)(-(param0 * 37L) + var7)];
                          if (var9 != 95) {
                            break L2;
                          } else {
                            var10 = -1 + var12.length();
                            var12.setCharAt(var10, Character.toUpperCase(var12.charAt(var10)));
                            var9 = 160;
                            break L2;
                          }
                        }
                        discarded$2 = var12.append((char) var9);
                        continue L1;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L0;
                  }
                }
              } else {
                var3 = 0;
                var4 = param0;
                L3: while (true) {
                  if ((var4 ^ -1L) == -1L) {
                    var13 = new StringBuilder(var3);
                    L4: while (true) {
                      if (0L == param0) {
                        var13.reverse();
                        var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
                        return var13.toString();
                      } else {
                        L5: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = ak.field_j[(int)(-(param0 * 37L) + var7)];
                          if (var9 != 95) {
                            break L5;
                          } else {
                            var10 = -1 + var13.length();
                            var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
                            var9 = 160;
                            break L5;
                          }
                        }
                        discarded$3 = var13.append((char) var9);
                        continue L4;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L3;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 37) {
          uj.a(103L, 16);
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    final static void a(en param0, int param1) {
        try {
            rb.field_O = param0;
            if (param1 != 95) {
                field_a = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "uj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_e = "Renown";
        field_a = "Please check if address is correct";
        field_b = "When entering a monster room, you can choose for your raider to Charge (increases Attack, decreases Defence), Advance (which leaves stats unchanged) or Flee (attempt to retreat from the room without engaging in combat). When combat begins, the raider's Sneak level is rolled against the monster's Detect level to determine who attacks first. In each round of combat, the attacker's Attack level is rolled against the defender's Defence level - if the attacker wins, the defender is defeated, otherwise, if the defender wins, they get a turn to attack. Fleeing works in much the same way, but instead of attacking each round, the raider rolls Dodge against the room's Snare - if successful, the raider escapes.";
    }
}
